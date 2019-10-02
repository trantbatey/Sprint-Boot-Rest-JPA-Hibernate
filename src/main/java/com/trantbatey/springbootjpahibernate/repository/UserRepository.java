package com.trantbatey.springbootjpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantbatey.springbootjpahibernate.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}