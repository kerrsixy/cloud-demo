package com.zjp.userservice.service.impl;

import com.zjp.common.entity.User;
import com.zjp.userservice.mapper.UserMapper;
import com.zjp.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.zjp.userservice.service.impl
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 11:27
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public User getUserById(Long id) {
        return userMapper.selectUserById(id);
    }
}
