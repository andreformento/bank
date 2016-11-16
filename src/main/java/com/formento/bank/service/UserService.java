package com.formento.bank.service;

import com.formento.bank.model.User;
import com.formento.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        // TODO verify permission
        return userRepository.list();
    }

}
