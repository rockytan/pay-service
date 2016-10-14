package com.ulife.platform.portal.controller.system

import com.ulife.platform.base.entities.Permission
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by Rocky on 9/14/16.
 */
@Controller
@RequestMapping("system/menu")
class MenuController {

    @RequestMapping()
    def index(Permission permission, Model model){
        "system/menu/list"
    }
}
