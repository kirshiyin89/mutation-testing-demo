package com.mutation.demo.util;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;


class RandomNumberGeneratorTest {

    @Test
    void generateNumberFromRange_shouldReturnEven() throws NoSuchAlgorithmException {
        RandomNumberGenerator.generateNumberFromRange(100);
    }

    @Test
    void generateNumberFromRange_shouldReturnOdd() throws NoSuchAlgorithmException {
        RandomNumberGenerator.generateNumberFromRange(101);
    }
}