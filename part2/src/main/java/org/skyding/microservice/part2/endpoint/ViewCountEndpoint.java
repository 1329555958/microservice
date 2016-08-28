package org.skyding.microservice.part2.endpoint;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

/**
 * Created by wid on 2016/8/28.
 */
@Component
public class ViewCountEndpoint extends AbstractEndpoint<ViewCount> {
    public ViewCountEndpoint() {
        super("viewcount");
    }

    @Override
    public ViewCount invoke() {
        return ViewCount.newInstance();
    }
}
