package com.cqrsexample.Repo;

import com.cqrsexample.Command.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
