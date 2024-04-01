package com.example.roleuser.repositories;

import com.example.roleuser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
