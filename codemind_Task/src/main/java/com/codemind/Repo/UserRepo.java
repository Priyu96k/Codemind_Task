package com.codemind.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemind.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
//	User findByUsername(String username);
}
