package com.example;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RetrofitScan("com.example")
public class Demo456Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo456Application.class, args);
    }

}
