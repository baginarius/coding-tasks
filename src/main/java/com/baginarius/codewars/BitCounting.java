package com.baginarius.codewars;

public class BitCounting {
    public static int countBits(int n) {
        //easiest way -> Integer.bitCount(n)
        return Integer.toBinaryString(n).replace("0", "").length();
    }
}
