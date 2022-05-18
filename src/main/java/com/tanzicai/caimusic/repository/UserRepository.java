package com.tanzicai.caimusic.repository;

import com.tanzicai.caimusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

//    List<User> findByUsername(String username);
    User getUserByUsername(String username);
}
