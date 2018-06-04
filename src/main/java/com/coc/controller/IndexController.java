package com.coc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Name:IndexController
 * Description:
 * Author:yangxiaocui
 * Time: 2018/6/4 14:58
 */
@Controller
@RequestMapping(value = "/user")
public class IndexController {
/**
 * 初始化登录界面
 * @return
 */
@RequestMapping(value = "/login_view",method = RequestMethod.GET)
public String login_view(){
    return "login";
}

@RequestMapping(value = "/index",method = RequestMethod.GET)
public String index(){
    return "index";
}
}
