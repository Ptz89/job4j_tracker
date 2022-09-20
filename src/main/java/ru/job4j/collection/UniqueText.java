package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> calculate = new HashSet<>();

        for (String str : origin) {
            calculate.add(str);
        }

        for (String txt : text) {
            if (!calculate.contains(txt)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
