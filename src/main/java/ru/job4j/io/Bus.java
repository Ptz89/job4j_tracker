package ru.job4j.io;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Маршрут №3 ");
    }

    @Override
    public void passengers(int passengers) {
        int seats = 100;
        System.out.println("Свободных мест " + (seats - passengers));

    }

    @Override
    public double fill(double fuel) {
        double cistern = 50;
        return 10.5 * (cistern - fuel);
    }
}
