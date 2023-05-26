package com.scallion.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/23 13:59
 */
@Controller
public class RouterController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "toLogin";
    }
    @RequestMapping("/function1")
    public String function1(){
        return "/function1";
    }
    @RequestMapping("function2")
    public String function2(){
        return "function2";
    }
    @RequestMapping("function3")
    public String function3(){
        return "function3";
    }
}
