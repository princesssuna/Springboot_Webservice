package com.seonaweb.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { // 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 web application server(WAS)
    }
}