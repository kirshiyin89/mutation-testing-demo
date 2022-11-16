package com.mutation.demo.app;

import com.mutation.demo.util.RandomNumberGenerator;

import java.security.NoSuchAlgorithmException;

public class MainApp {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        var number = RandomNumberGenerator.generateNumberFromRange(100);
        System.out.println("Generated number: " + number);
    }
}
