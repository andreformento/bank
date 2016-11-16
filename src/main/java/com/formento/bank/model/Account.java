package com.formento.bank.model;

import java.math.BigDecimal;

public class Account {

    private final User user;
    private final BigDecimal accountBalance;
    private final BigDecimal limit;

    public Account(User user, BigDecimal accountBalance, BigDecimal limit) {
        this.user = user;
        this.accountBalance = accountBalance;
        this.limit = limit;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public Account increase(BigDecimal value) {
        return null;
    }

    public Account decrease(BigDecimal value) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return user != null ? user.equals(account.user) : account.user == null;

    }

    @Override
    public int hashCode() {
        return user != null ? user.hashCode() : 0;
    }

}
