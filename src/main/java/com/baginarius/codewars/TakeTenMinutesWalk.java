package com.baginarius.codewars;

public class TakeTenMinutesWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int sumX = 0, sumY = 0;
        for (char direction : walk) {
            switch (direction) {
                case 'n' -> sumY+=1;
                case 's' -> sumY-=1;
                case 'w' -> sumX-=1;
                case 'e' -> sumX+=1;
            }
        }
        return 0 == sumX && 0 == sumY;

    }
}
