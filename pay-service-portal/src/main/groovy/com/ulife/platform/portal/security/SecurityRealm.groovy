package com.ulife.platform.portal.security

import com.google.common.collect.Sets
import com.ulife.platform.base.services.UserService
import org.apache.commons.lang3.StringUtils
import org.apache.shiro.authc.*
import org.apache.shiro.authz.AuthorizationInfo
import org.apache.shiro.authz.SimpleAuthorizationInfo
import org.apache.shiro.realm.AuthorizingRealm
import org.apache.shiro.subject.PrincipalCollection
import org.springframework.stereotype.Component

import javax.annotation.Resource

/**
 * Created by Rocky on 9/13/16.
 */
@Component
class SecurityRealm extends AuthorizingRealm{

    @Resource UserService userService

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        def user = userService.login(principalCollection.primaryPrincipal)

        if(user == null){
            throw new UnknownAccountException("account does not exists")
        }

        def roleNames = Sets.newLinkedHashSet()
        def permissions = Sets.newLinkedHashSet()

        user.roles.each {
            roleNames.add(it.name)
            it.permissions.each { p ->
                permissions.add(p.code)
            }
        }

        def authorizationInfo = new SimpleAuthorizationInfo(roles: roleNames)
        authorizationInfo.addStringPermissions(permissions)
        authorizationInfo
    }



    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        def credentials = (UsernamePasswordToken) authenticationToken;

        if (StringUtils.isBlank(credentials.username)){
            throw new AuthenticationException("username cannot be null")
        }

        def user = userService.login(credentials.username)

        if (user == null){
            throw new UnknownAccountException("account does not exists")
        }

        new SimpleAuthenticationInfo(credentials.username,user.getPassword().toCharArray(),getName())
    }
}
