package com.ulife.platform.utils

/**
 * Created by Rocky on 2016/10/14.
 */
enum SignatureType {

    MD5(0,"MD5"),
    RSA(1,"RSA")

    int code
    String name

    SignatureType(code,name){
        this.code = code
        this.name = name
    }

}
