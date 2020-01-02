package io.daocloud.sdg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoqiang
 * @Date: 2019/10/22 3:47 PM
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
