package com.grin.logscooter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grin.logscooter.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
