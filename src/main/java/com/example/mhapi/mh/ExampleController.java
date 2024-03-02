package com.example.mhapi.mh;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    private final  ExampleService exampleService;

    @GetMapping("mh/test")
    public ResponseEntity<String> mhtest(){

        String result = exampleService.getResource();

        return ResponseEntity.ok(result);
    }

    @GetMapping("testjson")
    public ResponseEntity<String> testjson(){
        return ResponseEntity.ok("qweqwe");
    }
}
