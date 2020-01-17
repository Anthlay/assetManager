package com.whut.controller;
import com.whut.Service.userService;
import com.whut.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class userController {
    @Autowired
    private userService service;

    private userInfo UserInfo;


    @RequestMapping("/login.do")
    public String loginSuccess(Model model, userInfo user)
    {

        userInfo  userInfo=  service.loginUser(user);
        if(userInfo!=null){
            UserInfo=userInfo;
            if(userInfo.getIsMember()==0)
            {
                model.addAttribute("userName",user.getUserName());
                return "sucess";
            }
            else{
                return "redirect:/asset/fillAllAsset.do";
            }
        }
        else {
            return "../index";

        }

    }

    @RequestMapping("/toSuccess.do")
    public ModelAndView loginSuccess()
    {

        ModelAndView mv=new ModelAndView();
        mv.addObject("userName", UserInfo.getUserName());
        mv.setViewName("sucess");
        return mv;
    }







}
