package com.ydy.springboot_work;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_ {
    @RequestMapping("/hello")
    public String test(){
        return "3333333";
    }
}
