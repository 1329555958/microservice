package org.skyding.microservice.part2.enable;

import org.skyding.microservice.part2.domain.User;
import org.springframework.context.annotation.Bean;

/**
 * Created by wid on 2016/8/28.
 */
public class BeanFactory {

    @Bean
    public User user() {
        User u = new User();
        u.setName("enable user");
        return u;
    }
}
