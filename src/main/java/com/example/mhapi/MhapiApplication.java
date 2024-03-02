package com.example.mhapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class MhapiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MhapiApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames())
                .filter(s -> s.contains("example"))
                .forEach(System.out::println);


    }

}
