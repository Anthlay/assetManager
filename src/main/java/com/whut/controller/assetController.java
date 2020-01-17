package com.whut.controller;

import com.github.pagehelper.PageInfo;
import com.whut.Service.OperaterService;
import com.whut.Service.assetService;
import com.whut.beans.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.whut.beans.Assset;
import com.whut.Dao.assetDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Service;
import java.util.List;

@Controller
@RequestMapping("asset")
public class assetController {

    @Autowired
    private assetService assetservice;
    @Autowired
    private OperaterService operatorService;

    @RequestMapping("/fillAllAsset.do")
    public ModelAndView fillAsset(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int size){
        List<Assset> showAssets = assetservice.showAssets(page,size);
        PageInfo pageInfo = new PageInfo(showAssets);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("m-asset");
        return mv;
    }
    @RequestMapping("/findAssetByName.do")
    public ModelAndView findAssetByName(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "5") int size, Assset asset ){
        List<Assset> a_search = assetservice.findAssetByName(asset.getAssetName());
        PageInfo asset_search = new PageInfo(a_search);
        ModelAndView mv = new ModelAndView();
        mv.addObject("asset_search",asset_search);
        mv.setViewName("search_result_asset");
        return mv;
    }

    @RequestMapping("toAddAsset")//增
    public ModelAndView toAddAsset(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "50") int size, Assset asset){
        List<Operator> operator = operatorService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(operator);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("addAsset");
        return mv;
    }

    @RequestMapping("save.do")//保存
    public String save(Assset asset){
        assetservice.addAsset(asset);
        return "redirect:/asset/fillAllAsset.do";
    }

    @RequestMapping("deleteAsset.do")//删除
    public String deleteAsset(Assset asset){
        assetservice.deleteAsset(asset);
        return "redirect:/asset/fillAllAsset.do";
    }
    @RequestMapping("/toupdateAsset.do")
    public ModelAndView toupdateAsset(Model model, @RequestParam int id,@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "50") int size, Assset asset){
        model.addAttribute("asset",assetservice.searchbyID(id));
        List<Operator> operator = operatorService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(operator);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("updateAsset");
        return mv;
    }

    @RequestMapping("/update.do")
    public String updateAsset(Assset asset){
        assetservice.updateAsset(asset);
        System.out.println(asset);
        return "redirect:/asset/fillAllAsset.do";
    }

}
