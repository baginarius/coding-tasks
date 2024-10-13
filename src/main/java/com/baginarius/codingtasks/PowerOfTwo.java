package com.baginarius.codingtasks;

public class PowerOfTwo {

    public static boolean isPowerOfTwoBruteForce(int input) {
        if (input < 1) {
            return false;
        }
        long calculation = 1;
        while (calculation <= input) {
            if (calculation == input) {
                return true;
            }
            calculation = calculation * 2;
        }
        return false;
    }

    public static boolean isPowerOfTwo(int input) {
        if (input < 1) {
            return false;
        }
        double calculation = input;
        while (calculation >= 1) {
            if (calculation == 1) {
                return true;
            }
            calculation = calculation / 2;
            System.out.println(calculation);
        }
        return false;
    }
}
