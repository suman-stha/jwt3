package com.jwt3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
