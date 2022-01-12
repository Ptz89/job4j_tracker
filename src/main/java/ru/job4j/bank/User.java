package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель клиента банка
 * @author Malyshev Dmitriy
 * @version 1.0
 */
public class User {
    /**
     * Паспортные данные клиента
     */
    private String passport;
    /**
     * Имя клиента банка
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает паспортные данные клиента
     * @return Паспортные данные клиента
     */
    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
