package com.mutation.demo.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PitestDemo {

    private PitestDemo() {
    }

    public static boolean isIsogram(String input) {
        String[] splitString = input.split("");
        Set<String> set = new HashSet<>(Arrays.asList(splitString));
        return input.length() == set.size();
    }

    public static boolean isWithinRange(int number) {
        return number <= 100 && number >= 10;
    }

}
