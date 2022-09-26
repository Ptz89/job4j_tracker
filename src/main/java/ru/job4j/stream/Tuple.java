package ru.job4j.stream;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple)) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.getScore(), getScore()) == 0 && getName().equals(tuple.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }
}
