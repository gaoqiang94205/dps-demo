package io.daocloud.sdg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoqiang
 * @Date: 2019/10/22 3:47 PM
 */
@RestController
public class HelloController {
    Girl girl = new Girl("marry", 18);
    Boy boy = new Boy("tom", 18);

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping
    public String say() {
        return "Hi, girl friends!";
    }

    @PostMapping
    public String play() {
        return girl.getName() + "play with " + boy.getName();
    }
}
