package com.ulife.platform.utils

/**
 * Created by Rocky on 9/13/16.
 */
class ID {

    static def uuid(){
        UUID.randomUUID().toString().replace("-","")
    }
}
