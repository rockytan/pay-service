package com.ulife.platform.api

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Component

/**
 * Created by Rocky on 2016/10/14.
 */
@SpringBootApplication
@EnableJpaRepositories("com.ulife.platform")
@EntityScan("com.ulife.platform")
class Bootstrap {

    static void main(String[] args){
        SpringApplication.run Bootstrap,args
    }
}

@Component
class CLR implements CommandLineRunner{

    @Override
    void run(String... args) throws Exception {

    }
}
