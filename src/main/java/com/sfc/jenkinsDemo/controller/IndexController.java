package com.sfc.jenkinsDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sufuchuan on 2020/2/22.
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "spring boot demo from jenkins,content changed by github.";
    }
}
