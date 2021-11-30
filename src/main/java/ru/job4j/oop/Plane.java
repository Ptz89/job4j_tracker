package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(" Самолетит летит в небе");
    }

    @Override
    public void speed() {
        System.out.println("Со скоростью 980км/час");
    }
}
