package com.tanzicai.caimusic.service;

import com.tanzicai.caimusic.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> list();
}
