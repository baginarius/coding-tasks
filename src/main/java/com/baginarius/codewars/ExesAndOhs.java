package com.baginarius.codewars;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int lenO = str.toLowerCase().replace("o", "").length();
        int lenX = str.toLowerCase().replace("x", "").length();
        return lenO == lenX;
    }
}
