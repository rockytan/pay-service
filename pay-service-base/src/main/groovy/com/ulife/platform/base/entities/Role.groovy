package com.ulife.platform.base.entities

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

/**
 * Created by Rocky on 9/13/16.
 */
@Entity
class Role extends DataEntity{

    @NotNull
    String name
    @NotNull
    String code
    String description
    @OneToMany
    @JoinTable(inverseJoinColumns = [@JoinColumn(name="permission_id")])
    Set<Permission> permissions
}
