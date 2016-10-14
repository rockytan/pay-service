package com.ulife.platform.portal.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by Rocky on 2016/10/14.
 */
@Controller
class HomeController {

    @RequestMapping("index")
    def index(Model model){

        model.addAttribute("message","Groovy Freemarker")
        "index"

    }

}
