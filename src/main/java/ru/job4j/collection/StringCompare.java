package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Comparing strings should not be null");
        }
        int size = Math.min(left.length(), right.length());
        for (int i = 0; i < size; i++) {
            int rst = Character.compare(left.charAt(i), right.charAt(i));
            if (rst != 0) {
                return rst;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}