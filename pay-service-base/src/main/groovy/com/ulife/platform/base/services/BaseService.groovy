package com.ulife.platform.base.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Rocky on 9/13/16.
 */
abstract class BaseService<Repository extends JpaRepository,T,ID> {

    @Autowired
    Repository repository

    T get(ID id){
        repository.getOne(id)
    }

    boolean exists(ID id){
        repository.exists(id)
    }

    List<T> list(){
        repository.findAll()
    }

    Page<T> list(Pageable pageable){
        repository.findAll(pageable)
    }

    T save(T entity){
        repository.save(entity)
    }

    List<T> save(Iterable<T> entities){
        repository.save(entities)
    }


}
