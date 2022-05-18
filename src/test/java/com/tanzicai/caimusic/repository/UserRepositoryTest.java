package com.tanzicai.caimusic.repository;

import com.tanzicai.caimusic.entity.User;
import com.tanzicai.caimusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void findByUsername() {

//        User user = new User();
//        user.setUsername("uni");
//        user.setNickname("tanzicai");
//        user.setEnabled(true);
//        user.setLocked(false);
//        user.setPassword("123456");
//        user.setGender(Gender.MALE);
//        user.setLastLoginIp("127.0.01");
//        user.setLastLoginTime(new Date());
//        User save = repository.save(user);
//        System.out.println(save.toString());
//
//        User cai = repository.getUserByUsername("uni");
//        System.out.println(cai.toString());

    }
}