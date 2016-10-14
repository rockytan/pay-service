package com.ulife.platform.base.repositories

import com.ulife.platform.base.entities.Permission
import org.springframework.data.jpa.repository.JpaRepository

import javax.persistence.OrderBy

/**
 * Created by Rocky on 9/13/16.
 */
interface PermissionRepository extends JpaRepository<Permission,String>{

    @OrderBy("sort asc")
    List<Permission> findByTypeAndStatusAndDepthAndIsDelete(int type, int status, int depth, Boolean isDelete)

    List<Permission> findByUrl(String url)
}