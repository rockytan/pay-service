package com.ulife.platform.portal

import com.ulife.platform.portal.tags.MenusMethodModel
import freemarker.template.Configuration
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

import javax.annotation.Resource

@SpringBootApplication(scanBasePackages = "com.ulife.platform")
@EnableJpaRepositories("com.ulife.platform")
@EntityScan("com.ulife.platform")
class DemoApplication implements CommandLineRunner{

	@Resource Configuration freeMarkerConfiguration

	static void main(String[] args) {
		SpringApplication.run DemoApplication, args
	}

	@Override
	void run(String... args) throws Exception {
		freeMarkerConfiguration.setSharedVariable("menus",new MenusMethodModel())
	}
}

