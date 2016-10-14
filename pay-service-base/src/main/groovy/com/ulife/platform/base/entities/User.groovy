package com.ulife.platform.base.entities

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

/**
 * Created by Rocky on 9/12/16.
 */
@Entity
class User extends DataEntity {

    @NotNull
    String loginName;
    @NotNull
    String password;
    String realName;
    @OneToMany
    @JoinTable(inverseJoinColumns = [@JoinColumn(name="role_id")])
    Set<Role> roles
}