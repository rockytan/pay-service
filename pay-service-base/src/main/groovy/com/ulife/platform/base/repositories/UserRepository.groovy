package com.ulife.platform.base.repositories

import com.ulife.platform.base.entities.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Rocky on 9/13/16.
 */
interface UserRepository extends JpaRepository<User,String>{

    def findByLoginNameAndStatus(def loginName,int status)

}