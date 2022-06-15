package com.tanzicai.caimusic.service.impl;

import com.tanzicai.caimusic.entity.User;
import com.tanzicai.caimusic.exception.BizException;
import com.tanzicai.caimusic.exception.ExceptionType;
import com.tanzicai.caimusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;


public abstract class BaseService {

    private UserRepository userRepository;


    protected User getCurrentUserEntity() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // todo
        return loadUserByUsername(authentication.getName());
    }

    protected User loadUserByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (!user.isPresent()) {
            throw new BizException(ExceptionType.USER_NOT_FOUND);
        }
        return user.get();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
