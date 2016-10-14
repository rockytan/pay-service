package com.ulife.platform.portal.controller

import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.UsernamePasswordToken
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by Rocky on 9/12/16.
 */
@Controller
class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    def login(){
        "login"
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    def authenticate(UsernamePasswordToken token){
        def subject = SecurityUtils.subject
        subject.login(token)
        "redirect:index.html"
    }
}
