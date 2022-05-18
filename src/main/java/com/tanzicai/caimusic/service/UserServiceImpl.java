package com.tanzicai.caimusic.service;

import com.tanzicai.caimusic.dto.UserDto;
import com.tanzicai.caimusic.mapper.UserMapper;
import com.tanzicai.caimusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{


    UserMapper mapper;
    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> list() {
        return userRepository.findAll()
                .stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
