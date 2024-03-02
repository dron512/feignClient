package com.example.mhapi.mh;

import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {
    private final ExampleClient exampleClient;

    public String getResource() {
        return exampleClient.getResource();
    }
}

