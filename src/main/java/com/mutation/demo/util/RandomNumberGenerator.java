package com.mutation.demo.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandomNumberGenerator {

    private RandomNumberGenerator() {
    }

    public static int generateNumberFromRange(int maxRange) throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
        int randomNum;
        if (maxRange == 100) {
            randomNum = rand.nextInt(maxRange / 2) * 2;
        } else {
            randomNum = rand.nextInt(maxRange / 2) * 2 + 1;
        }
        return randomNum;
    }
}
