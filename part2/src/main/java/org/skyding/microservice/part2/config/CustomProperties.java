package org.skyding.microservice.part2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wid on 2016/8/28.
 */
@ConfigurationProperties(prefix = "custom.properties")
@Component
public class CustomProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
