package com.edu.erp.repository;

import com.edu.erp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOne(Long id);

    User saveAndFlush(User user);
}
