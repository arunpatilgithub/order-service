package com.ap.orderservice.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "myapp")
public record ClientProperties (

        @NotNull
        URI catalogServiceUri

){}
