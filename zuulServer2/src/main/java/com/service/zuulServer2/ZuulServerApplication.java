package com.service.zuulServer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author muyou
 * @date 2020/12/9 15:10
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApplication {
    public static void main(String[] args) {
       ConfigurableApplicationContext context  = SpringApplication.run(ZuulServerApplication.class);
    }
}
