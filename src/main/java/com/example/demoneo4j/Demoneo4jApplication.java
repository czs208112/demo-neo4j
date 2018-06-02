package com.example.demoneo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Demoneo4jApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demoneo4jApplication.class, args);
    }

    @Autowired
    UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        List<User> userList = userRepo.getUser();
        System.out.println(userList.toString() + ">>>>>>>>>>>>>>");
    }
}
