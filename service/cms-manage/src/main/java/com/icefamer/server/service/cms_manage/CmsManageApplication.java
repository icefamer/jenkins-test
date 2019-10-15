package com.icefamer.server.service.cms_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.icefamer.server.domain.cms")
@ComponentScan(basePackages = {"com.icefamer.server.api"})
@ComponentScan(basePackages = {"com.icefamer.server.service.cms_manage"})
public class CmsManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsManageApplication.class, args);
    }
}
