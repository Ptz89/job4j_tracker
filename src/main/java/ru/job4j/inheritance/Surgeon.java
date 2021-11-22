package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String kind;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getKind() {
        return kind;
    }
}
