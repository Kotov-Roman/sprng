package com.backend.sprng.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint (id = "hello")
public class HelloEndpoint {

    @ReadOperation
    public Map<String, String> hello(){
        return Map.of("hello", "it's working");
    }
}
