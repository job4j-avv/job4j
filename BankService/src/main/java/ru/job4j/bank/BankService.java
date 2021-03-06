package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в систему. Будет создан пустой список аккаунтов.
     *
     * @param user Пользователь.
     */
    public void addUser(User user) {
        List<Account> listAcc = new ArrayList<>();
        users.putIfAbsent(user, listAcc);
    }

    /**
     * Привязывает аккаунт к пользователю.
     *
     * @param user    Пользователь.
     * @param account Аккаунт.
     */
    public void addAccount(User user, Account account) {
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (account != null && !accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Привязывает аккаунт к пользователю, который указан по его паспортным данным.
     *
     * @param passport Данные Пользователя.
     * @param account  Аккаунт.
     */
    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        addAccount(user, account);
    }

    /**
     * Ищет пользователя по паспорту.
     *
     * @param passport паспорт.
     * @return Пользователь.
     */
    public User findByPassport(String passport) {
        Iterator iterator = users.keySet().iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            if (user != null && passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * @param passport  Паспорт пользователя.
     * @param requisite Реквизиты аккаунта.
     * @return Найденный аккаунт
     */
    public Account findByRequisite(String passport, String requisite) {
        List<Account> findedAccount = users.get(findByPassport(passport));
        if (findedAccount == null) {
            return null;
        }
        Iterator<Account> accIter = findedAccount.iterator();
        while (accIter.hasNext()) {
            Account acc = accIter.next();
            if (requisite.equals(acc.getRequisite())) {
                return acc;
            }
        }
        return null;
    }

    /**
     * Осуществляет операцию перевода средств со счета одного пользователя на счет другого.
     *
     * @param srcPassport   паспорт пользователя со счета которого переводятся средства
     * @param srcRequisite  реквизиты пользователя со счета которого переводятся средства
     * @param destPassport  паспорт пользователя на счет которого переводятся средства
     * @param destRequisite реквизиты пользователя на счет которого переводятся средства
     * @param amount        сумма перевода
     * @return Флаг - прошла ли операция успешно.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean transferSuccessful = false;
        Account sourceAccount = findByRequisite(srcPassport, srcRequisite);
        Account destinationAccount = findByRequisite(destPassport, destRequisite);
        if (sourceAccount != null && destinationAccount != null && amount > 0) {
            double sourceAccountBalance = sourceAccount.getBalance();
            double destinationAccountBalance = destinationAccount.getBalance();
            if (sourceAccountBalance >= amount) {
                sourceAccountBalance = sourceAccountBalance - amount;
                destinationAccountBalance = destinationAccountBalance + amount;
                sourceAccount.setBalance(sourceAccountBalance);
                destinationAccount.setBalance(destinationAccountBalance);
                transferSuccessful = true;
                System.out.println("Операция проведенна успешно !");
            } else {
                System.out.println("недостаточно средств !");
            }
        }
        return transferSuccessful;
    }
}