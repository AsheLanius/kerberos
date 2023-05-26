package com.scallion.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/19 16:30
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello,you get this 'Hello' from service";
    }
}
