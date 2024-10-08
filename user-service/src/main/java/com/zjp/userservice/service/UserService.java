package com.zjp.userservice.service;

import com.zjp.common.entity.User;

/**
 * ClassName: UserService
 * Package: com.zjp.userservice.service
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 11:27
 * @Version 1.0
 */
public interface UserService {
    User getUserById(Long id);
}
