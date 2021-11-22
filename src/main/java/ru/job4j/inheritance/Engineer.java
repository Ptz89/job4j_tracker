package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getExperience() {
        return experience;
    }
}
