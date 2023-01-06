package com.m7md.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m7md.hospitalManager.beans.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
