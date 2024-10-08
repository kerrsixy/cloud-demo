package com.zjp.feginservice.client;

import com.zjp.common.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: UserClient
 * Package: com.zjp.feginservice.client
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 13:55
 * @Version 1.0
 */
@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") Long id);
}