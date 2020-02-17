package com.sfc.controller;

import com.sfc.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sufuchuan on 2020/2/17.
 */
@RestController
public class IndexController {

    @ResponseBody
    @RequestMapping("index")
    public User index(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("sfc");
        return user;
    }
}
