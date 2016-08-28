package org.skyding.microservice.part2.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by wid on 2016/8/28.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(BeanFactory.class)
public @interface EnableCustom {
}
