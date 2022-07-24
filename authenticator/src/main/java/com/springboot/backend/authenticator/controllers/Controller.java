package com.springboot.backend.authenticator.controllers;

import com.springboot.backend.authenticator.model.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping
    public String createUser(@RequestBody UserInfo userInfo )
    {
        if(userInfo.getUserid() != null && userInfo.getPassword() != null)
            return "Login successful";

        return "Login Failed";
    }
}
