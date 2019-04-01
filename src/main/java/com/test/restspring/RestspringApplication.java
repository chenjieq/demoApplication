package com.test.restspring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
//@EnableAutoConfiguration
public class RestspringApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestspringApplication.class, args);
    }
//
//    @Bean
//    public ServletWebServerFactory servletFactory() {
//
//        TomcatServletWebServerFactory tomcatFactory =
//                new TomcatServletWebServerFactory();
//        tomcatFactory.setPort(8011);
//
//       // tomcatFactory.setSessionTimeout(10, TimeUnit.SECONDS);
//        return tomcatFactory;
//
//
//    }



}
