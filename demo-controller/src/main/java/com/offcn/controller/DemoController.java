package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service111.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    UserService userService;

    @RequestMapping("hello.action")
    public ModelAndView demo() {
        List<User> userList = userService.getUserList();
        ModelAndView mav=new ModelAndView();
        mav.addObject("userList",userList);
        mav.setViewName("hello");
        return mav;
    }

    public void get(){

    }
}
