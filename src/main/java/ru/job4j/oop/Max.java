package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int three) {
        return max(left, (max(right, three)));
    }

    public static int max(int left, int right, int three, int four) {
        return max(four, (max(left, (max(right, three)))));
    }
}
