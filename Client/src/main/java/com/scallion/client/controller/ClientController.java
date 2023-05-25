package com.scallion.client.controller;

import com.scallion.client.service.SampleClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/24 14:21
 */
@Controller
public class ClientController {
    @Resource
    private SampleClient sampleClient;

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return "sayHello";
    }

    @RequestMapping("getHello")
    @ResponseBody
    public String getHello() {
        return sampleClient.getData();
    }
}
