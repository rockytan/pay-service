package com.ulife.platform.base.services

import com.ulife.platform.base.entities.Permission
import com.ulife.platform.base.repositories.PermissionRepository
import org.springframework.stereotype.Component

/**
 * Created by Rocky on 9/13/16.
 */
@Component
class PermissionService extends BaseService<PermissionRepository,Permission,String>{

    public List<Permission> getMenus(){
        repository.findByTypeAndStatusAndDepthAndIsDelete(Permission.MENU,Permission.NORMAL,Permission.ROOT,Permission.EXIST)
    }

    Permission getMenuByUrl(String url){
        def menus = repository.findByUrl(url)
        menus.size() > 0 ? menus.first() : null
    }
}
