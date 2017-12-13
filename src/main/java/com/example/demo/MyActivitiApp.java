package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MyActivitiApp {

    public static void main(String[] args) {
        SpringApplication.run(MyActivitiApp.class, args);
    }




//    @Bean
//    public CommandLineRunner init(final MyService myService) {
//
//        return new CommandLineRunner() {
//            public void run(String... strings) throws Exception {
//                myService.createDemoUsers();
//            }
//        };

//    }



}


