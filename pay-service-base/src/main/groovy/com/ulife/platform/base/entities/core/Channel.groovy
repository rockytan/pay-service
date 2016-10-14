package com.ulife.platform.base.entities.core

import com.sun.tools.corba.se.idl.constExpr.Not
import com.ulife.platform.base.entities.common.DataEntity
import com.ulife.platform.utils.SignatureType

import javax.persistence.Entity
import javax.validation.constraints.NotNull

/**
 * Created by Rocky on 2016/10/14.
 */
@Entity
class Channel extends DataEntity{

    final static int ONLINE = 0
    final static int OFFLINE = 1

    @NotNull
    String name
    @NotNull
    String code
    int type = ONLINE
    String description
    int signType = SignatureType.MD5.code
    @NotNull
    String apiKey
    @NotNull
    String appId
    @NotNull
    String merchantId
    @NotNull
    String merchantKey
    @NotNull
    String platformKey

}
