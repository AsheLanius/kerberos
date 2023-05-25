package com.scallion.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/25 14:19
 */
@Controller
public class Hello {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
