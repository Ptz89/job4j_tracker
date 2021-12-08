package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(0));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorials of negative integers are undefined");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
                rsl *= index;
        }
        return rsl;
    }
}
