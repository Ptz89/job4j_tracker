package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель банковского счёта
 * @author Malyshev Dmitriy
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты банковского счёта
     */
    private String requisite;

    /**
     * Баланс банковского счёте
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Мтод возвращает реквизиты банковского счёта
     * @return реквизиты банковского счёта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод возвращает баланс банковского счёте
     * @return баланс банковского счёте
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает баланс банковского счёта равным переданному значению
     * @param balance новое значение баланса банковского счёте
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
