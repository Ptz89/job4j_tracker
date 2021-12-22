package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Vv@mail.ru", "Ivanov");
        map.put("Google@gogle.com", "Smirnov");
        map.put("Yand@yandex.ru", "Cudorov");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
