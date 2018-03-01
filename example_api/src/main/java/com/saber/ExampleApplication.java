package com.saber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/23 上午11:40
 */
@SpringBootApplication
@EnableRedisHttpSession
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class,args);
    }
}
