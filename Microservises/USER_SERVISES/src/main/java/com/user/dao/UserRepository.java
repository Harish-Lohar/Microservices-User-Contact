package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
