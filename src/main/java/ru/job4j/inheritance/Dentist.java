package ru.job4j.inheritance;

public class Dentist extends Doctor {
    public int price;

    public Dentist(String name, String surname, String education, String birthday, String clinic, int price) {
        super(name, surname, education, birthday, clinic);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
