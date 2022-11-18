package com.mutation.demo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class PitestDemoTest {

    @Test
    void generateNumberFromRange_shouldReturnTrue() {
        var result = PitestDemo.isIsogram("chair");
        System.out.println(result);
        Assertions.assertTrue(result);
    }

    @Test
    void generateNumberFromRange_shouldReturnFalse() {
        var result = PitestDemo.isIsogram("look");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 100})
    void isWithinRange_shouldReturnTrue(int input) {
        var result = PitestDemo.isWithinRange(input);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {105, -150})
    void isWithinRange_shouldReturnFalse(int input) {
        var result = PitestDemo.isWithinRange(input);
        Assertions.assertFalse(result);
    }

}