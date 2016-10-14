package com.ulife.platform.base.entities.common

import javax.persistence.Column
import javax.persistence.PrePersist
import javax.persistence.PreUpdate
import javax.persistence.Version
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotNull
import java.time.LocalDateTime

/**
 * Created by Rocky on 9/13/16.
 */
@MappedSuperclass
abstract class DataEntity extends BaseEntity{

    public final static int NORMAL = 0
    public final static boolean DELETED = true
    public final static boolean EXIST = false
    public final static int WAIT_AUDIT = 1
    public final static int REJECT = -1

    String creator
    @Column(columnDefinition = "timestamp")
    @NotNull
    LocalDateTime createdTime
    String modifier
    @Column(columnDefinition = "timestamp")
    @NotNull
    LocalDateTime modifiedTime
    int status = NORMAL
    @Column(columnDefinition = "tinyint")
    boolean isDelete = NORMAL
    @Version
    Integer version

    @PrePersist
    @Override
    void prePersist(){
        super.prePersist()
        createdTime = LocalDateTime.now()
    }

    @PreUpdate
    void preUpdate(){
        modifiedTime = LocalDateTime.now()
    }
}
