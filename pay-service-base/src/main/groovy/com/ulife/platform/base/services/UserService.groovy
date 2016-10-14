package com.ulife.platform.base.services

import com.ulife.platform.base.entities.User
import com.ulife.platform.base.repositories.UserRepository
import org.springframework.stereotype.Component

/**
 * Created by Rocky on 9/13/16.
 */
@Component
class UserService extends BaseService<UserRepository,User,String>{

    User login(def loginName){
        repository.findByLoginNameAndStatus(loginName,0)
    }
}
