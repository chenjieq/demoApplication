package com.test.restspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableAutoConfiguration
public class RestspringApplication {


    public static void main(String[] args) {

        System.out.println("Hello World ! App!");
        SpringApplication.run(RestspringApplication.class, args);
    }

    @Bean
    public ServletWebServerFactory servletFactory() {

        TomcatServletWebServerFactory tomcatFactory =
                new TomcatServletWebServerFactory();
        tomcatFactory.setPort(8011);

       // tomcatFactory.setSessionTimeout(10, TimeUnit.SECONDS);
        return tomcatFactory;


    }
}
