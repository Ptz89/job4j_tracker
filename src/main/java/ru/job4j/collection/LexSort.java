package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Comparing strings should not be null");
        }
        String lt = left.split(". ")[0];
        String rt = right.split(". ")[0];
        return Integer.compare(Integer.parseInt(lt), Integer.parseInt(rt));
    }
}