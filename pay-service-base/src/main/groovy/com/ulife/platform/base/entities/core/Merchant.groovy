package com.ulife.platform.base.entities.core

import com.ulife.platform.base.entities.common.DataEntity
import com.ulife.platform.utils.SignatureType

import javax.persistence.Entity
import javax.validation.constraints.NotNull

/**
 * Created by Rocky on 2016/10/14.
 */
@Entity
class Merchant extends DataEntity{

    @NotNull
    String name
    @NotNull
    String code
    String description
    int signType = SignatureType.MD5.code
    @NotNull
    String publicKey
    @NotNull
    String privateKey

}
