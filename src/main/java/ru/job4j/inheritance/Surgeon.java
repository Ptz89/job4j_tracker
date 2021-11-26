package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String kind;

    public Surgeon(String name, String surname, String education, String birthday, String clinic, String kind) {
        super(name, surname, education, birthday, clinic);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}
