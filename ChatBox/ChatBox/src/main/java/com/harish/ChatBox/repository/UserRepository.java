package com.harish.ChatBox.repository;

import com.harish.ChatBox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
