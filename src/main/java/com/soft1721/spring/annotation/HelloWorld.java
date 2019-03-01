package com.soft1721.spring.annotation;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public String getHello() {
        return "Hello World";
    }
}

