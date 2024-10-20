package com.baginarius.codewars;

public class Mumbling {

    public static String accum(String s) {
        String[] all = s.toUpperCase().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < all.length; i++) {
            if (i > 0) {
                sb.append("-");
            }
            sb.append(all[i]);
            sb.append(all[i].repeat(i).toLowerCase());
        }

        return sb.toString();
    }

}
