package com.mutation.demo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PitestDemoTest {

    @Test
    void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<PitestDemo> constructor = PitestDemo.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    void generateNumberFromRange_shouldReturnTrue() {
        var result = PitestDemo.isIsogram("chair");
        Assertions.assertTrue(result);
    }

    @Test
    void generateNumberFromRange_shouldReturnFalse() {
        var result = PitestDemo.isIsogram("look");
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 15, 100})
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