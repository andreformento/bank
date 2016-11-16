package com.formento.bank.model;

import java.util.Optional;

public class User implements Comparable<User> {

    private final String document;
    private final String name;
    private final Optional<String> emailAddress;

    public User(String document, String name, Optional<String> emailAddress) {
        this.document = document;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmailAddress() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return document.equals(user.document);

    }

    @Override
    public int hashCode() {
        return document.hashCode();
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }

}
