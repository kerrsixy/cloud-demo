package com.zjp.userservice.controller;

import com.zjp.common.entity.User;
import com.zjp.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.zjp.userservice.controller
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 11:26
 * @Version 1.0
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id) {
        // 模拟异常
        if (id >= 7) {
            throw new RuntimeException("用户不存在");
        }
        return userService.getUserById(id);
    }
}
