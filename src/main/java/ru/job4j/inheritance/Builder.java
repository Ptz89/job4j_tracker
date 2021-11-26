package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String type;

    public Builder(String name, String surname, String education, String birthday, int experience, String type) {
        super(name, surname, education, birthday, experience);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
