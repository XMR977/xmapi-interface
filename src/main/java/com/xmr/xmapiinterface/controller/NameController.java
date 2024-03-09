package com.xmr.xmapiinterface.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.xmr.xmapicilentsdk.model.User;

/**
 * Name API
 */
@RestController
@RequestMapping("/name")
@Slf4j
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name){

        return name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest httpServletRequest){
        String accessKey = httpServletRequest.getHeader("accessKey");
        String nonce = httpServletRequest.getHeader("accessKey");
        String timestamp = httpServletRequest.getHeader("secretKey");
        String sign = httpServletRequest.getHeader("accessKey");
        String body = httpServletRequest.getHeader("secretKey");
        if(!accessKey.equals("xm")){
            throw  new RuntimeException("error");
        }

        String result = "user name: " + user.getUsername();

        //usage add

        return result;
    }
}
