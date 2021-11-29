package ru.job4j.io;

public interface Transport {
    void drive();

    void passengers(int passengers);

    double fill(double fuel);
}
