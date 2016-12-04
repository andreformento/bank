package com.formento.bank.service;

import com.formento.bank.model.User;
import com.formento.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> list() {
        // TODO verify permission
        return userRepository.list();
    }

}
