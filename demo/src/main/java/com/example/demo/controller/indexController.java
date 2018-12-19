package com.example.demo.controller;


import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class indexController {
    @Autowired
    UserService userService;
    @GetMapping("/show")
    public List<User> getUser(int age){
        return userService.getUser(age);
    }
    @RequestMapping("/index")
    @ResponseBody
    public Map<String,String> index(){
        Map<String,String> map=new HashMap<>();
        map.put("guagnzhou","广州");
        map.put("shenzhen","深圳");
        return map;
    }

}
