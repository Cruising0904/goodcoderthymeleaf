package com.goodcoder.repository;

import com.goodcoder.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{
    
}
