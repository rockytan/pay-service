package com.ulife.platform.base.entities

import com.ulife.platform.base.entities.common.DataEntity

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

/**
 * Created by Rocky on 9/13/16.
 */
@Entity
class Permission extends DataEntity{

    public final static int ROOT = 1
    public final static int MENU = 0
    public final static int PRIVILEGE = 1

    @NotNull
    String name
    String icon
    @NotNull
    String code
    String description
    String url
    @OneToOne
    Permission parent
    @OneToMany(mappedBy = "parent")
    List<Permission> childrens
    int type
    @NotNull
    String path
    @NotNull
    int depth = 1
    int sort = 30
}
