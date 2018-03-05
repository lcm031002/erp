package com.edu.erp.core.user;

import com.edu.erp.domain.User;

public interface UserService {
    User selectByPrimaryKey(Long id);

    User findOne(Long id);

    User saveAndFlush(User user);
}
