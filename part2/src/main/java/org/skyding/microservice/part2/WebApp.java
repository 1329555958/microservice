package org.skyding.microservice.part2;

import org.skyding.microservice.part2.enable.EnableCustom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

/**
 * Created by wid on 2016/8/28.
 */
@SpringBootApplication
@EnableCustom
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class);
    }


}
