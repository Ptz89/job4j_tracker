package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейщую модель Банка
 * @author Malyshev Dmitriy
 * @version 1.0
 */
public class BankService {
    /**
     * Коллекция клиентов банка и их банковских счётов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента банка в колекцию. Клиент будет добавлен, если его еще нет.
     * @param user клиента банка.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счёт клиенту банка, клиент уже должен содержаться в коллекции.
     * Поиск клиента осуществляется по его паспортным данным.
     * Счёт будет добавлен, только если такого счёта ещё нет у клиента
     * @param passport паспортные данные клиента
     * @param account банковский счёт, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет клиента банка по паспортным данным
     * @param passport паспортные данные клиента
     * @return клиент банка, если он найден, иначе null
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет банковский счёт клиента по его паспорту и реквизитам банковского счёта
     * @param passport паспортные данные клиента
     * @param requisite Реквизиты банковского счёта
     * @return банковский счёт, если найден, иначе null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Переводит деньги между банковскими счетами.
     * @param srcPassport пасспортные данные клиента, который отправляет деньги.
     * @param srcRequisite реквизиты банковского счета, с которого будут списаны деньги.
     * @param destPassport пасспортные данные клиента, который получает деньги.
     * @param destRequisite реквизиты банковского счета, куда будут зачислены деньги.
     * @param amount сумма перевода
     * @return true, если операция прошла успешно, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}
