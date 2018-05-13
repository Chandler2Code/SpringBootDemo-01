package com.czyfwpla.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 02:54
 * @Description:
 */
@RestController
public class testController {

    @RequestMapping("/test")
    public String Test(){

        return "hello SpringBoot";
    }
}