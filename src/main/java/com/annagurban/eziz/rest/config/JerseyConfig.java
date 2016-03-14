package com.annagurban.eziz.rest.config;

import com.annagurban.eziz.rest.resources.GreetingResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(GreetingResource.class);
    }

}
