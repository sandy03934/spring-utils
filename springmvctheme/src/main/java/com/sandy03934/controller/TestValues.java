package com.sandy03934.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestValues {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("admin"));
    }
}
