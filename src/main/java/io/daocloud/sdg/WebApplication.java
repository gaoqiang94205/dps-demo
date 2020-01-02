package io.daocloud.sdg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: gaoqiang
 * @Date: 2019/10/22 3:43 PM
 */
@SpringBootApplication
@EnableAutoConfiguration
public class WebApplication {
    private static final Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String[] args) {

        for (int i = 0; i < 10000000; i++) {
            logger.info("log web application for time----->" + i);
            logger.info("debug web application for time----->" + i);
        }
        SpringApplication.run(WebApplication.class, args);
    }
}
