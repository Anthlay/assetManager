package com.whut.controller;


import com.github.pagehelper.PageInfo;
import com.whut.Service.OperaterService;
import com.whut.Service.assetService;
import com.whut.beans.Assset;
import com.whut.beans.Operator;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("operator")
public class OperatorController {
    @Autowired
    private OperaterService operatorService;
    @Autowired
    private assetService assetservice;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="8")int size) {
        List<Operator> operator = operatorService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(operator);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("m-operator");
        return mv;
    }

    @RequestMapping("toAddOperator")
    public ModelAndView toAddOperator(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "50") int size, Operator operator){
        List<Assset> showAssets = assetservice.showAssets(page,size);
        PageInfo pageInfo = new PageInfo(showAssets);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("addOperator");
        return mv;

    }

    @RequestMapping("save.do")
    public String save(Operator operator){
        operatorService.addOperator(operator);
        return "redirect:/operator/findAll.do";
    }

    @RequestMapping("deleteOperator.do")
    public String deleteOperator(Operator operator){
        operatorService.deleteOperator(operator);
        return "redirect:/operator/findAll.do";
    }
    @RequestMapping("/toupdateOperator.do")
    public ModelAndView toupdateOperator(Model model, @RequestParam int id,@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "50") int size, Operator operator){
        model.addAttribute("operator",operatorService.searchbyID(id));
        List<Assset> showAssets = assetservice.showAssets(page,size);
        PageInfo pageInfo = new PageInfo(showAssets);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("updateOperator");
        return mv;
    }

    @RequestMapping("/update.do")
    public String updateAsset(Operator operator){
        operatorService.updateOperator(operator);
        System.out.println(operator);
        return "redirect:/operator/findAll.do";
    }
    @RequestMapping("/findOperatorByName.do")
    public ModelAndView findOperatorByName(@RequestParam(defaultValue="1") int page,@RequestParam(defaultValue="5")int size,Operator operator){
        List<Operator> operators = operatorService.findOperatorByName(operator.getOperatorName());
        PageInfo pageInfo_s = new PageInfo(operators);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo_s",pageInfo_s);
        mv.setViewName("search_result_operator");
        return mv;
    }
}
