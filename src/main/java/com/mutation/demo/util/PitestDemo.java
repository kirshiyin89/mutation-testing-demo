package com.mutation.demo.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PitestDemo {

    private PitestDemo() {
    }

    public static boolean isIsogram(String input) {
        String[] ary = input.split("");
        Set<String> mySet = new HashSet<>(Arrays.asList(ary));
        return input.length() == mySet.size();
    }

    public static boolean isWithinRange(int number) {
        int max = 100;
        int min = 10;
        return number <= max && number >= min;
    }

}
