package com.turkcell.app;

import com.turkcell.app.entity.User;
import com.turkcell.app.repository.UserRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Genel veritabani
        UserRepository userRepository = new UserRepository();

        User user = new User();
        user.setId(1);
        user.setEmail("turkcell@gmail.com");
        user.setName("Turkcell");

        userRepository.save(user);

        User user2 = new User();
        user.setId(2);
        user.setEmail("turkcell1@gmail.com");
        user.setName("Turkcell1");

        userRepository.save(user2);

        List<User> users = userRepository.findAll();

        for (User user1: users){
            System.out.println(user1.getName());
        }

    }
}
