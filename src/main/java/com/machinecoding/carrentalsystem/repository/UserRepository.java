package com.machinecoding.carrentalsystem.repository;

import com.machinecoding.carrentalsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
