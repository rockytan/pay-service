package com.ulife.platform.base.entities.common

import com.ulife.platform.utils.ID

import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist

/**
 * Created by Rocky on 9/13/16.
 */
@MappedSuperclass
abstract class BaseEntity {

    @Id
    String id

    @PrePersist
    void prePersist(){
        id = ID.uuid()
    }
}
