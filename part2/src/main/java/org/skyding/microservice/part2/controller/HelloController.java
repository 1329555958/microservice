package org.skyding.microservice.part2.controller;

import org.skyding.microservice.part2.config.CustomProperties;
import org.skyding.microservice.part2.domain.User;
import org.skyding.microservice.part2.endpoint.ViewCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wid on 2016/8/28.
 */
@RestController
public class HelloController {

    @Autowired
    CustomProperties properties;

    @Autowired
    User user;

    @RequestMapping("/hello")
    public String hello(String name) {
        ViewCount.addCount();
        return "hello " + name;
    }

    @RequestMapping("/enable")
    public String enable() {
        return user.getName();
    }


    @RequestMapping("/properties")
    public String properties() {
        return properties.getName();
    }
}
