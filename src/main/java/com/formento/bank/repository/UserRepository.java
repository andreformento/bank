package com.formento.bank.repository;

import com.formento.bank.model.User;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {

    public Iterable<User> list() {
        return ImmutableList
                .<User>builder()
                .add(new User("123B", "Andre Formento", Optional.of("andreformento.sc@gmail.com")))
                .add(new User("123C", "Paul", Optional.empty()))
                .build();
    }

}
