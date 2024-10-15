package com.baginarius.codingtasks;

public class Factorial {
    public static long factorial(int input) {
        if (0 == input || 1 == input) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= input; i++) {
            result *=i;
        }
        return result;
    }

    public static long factorialRecusrive(int input) {
        if (0 == input) {
            return 1;
        }
        return input * factorialRecusrive(input - 1);
    }

}
