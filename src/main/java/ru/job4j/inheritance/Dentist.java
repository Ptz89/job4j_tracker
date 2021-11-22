package ru.job4j.inheritance;

public class Dentist extends Doctor {
    public int price;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getPrice() {
        return price;
    }
}
