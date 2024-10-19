package com.baginarius.codewars;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(it -> !(it instanceof String)).toList();
    }
}
