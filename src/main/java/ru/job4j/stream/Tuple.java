package ru.job4j.stream;

//содержит результаты: имя и баллы. Этот класс используется как для учеников, так и для предметов.

import java.util.Objects;

public class Tuple {

    private String name;
    private double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @SuppressWarnings("checkstyle:NeedBraces")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple)) return false;
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.getScore(), getScore()) == 0 && getName().equals(tuple.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }
}
