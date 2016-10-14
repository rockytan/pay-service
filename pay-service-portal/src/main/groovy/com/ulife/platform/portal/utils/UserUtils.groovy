package com.ulife.platform.portal.utils

import com.ulife.platform.base.entities.Permission
import com.ulife.platform.base.services.PermissionService
import com.ulife.platform.utils.SpringContextHolder

/**
 * Created by Rocky on 9/13/16.
 */
class UserUtils {

    static def permissionService = SpringContextHolder.getBean(PermissionService)

    static List<Permission> getMenus(){
        return permissionService.getMenus()
    }
}
