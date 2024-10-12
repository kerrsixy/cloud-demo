package com.zjp.userservice.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: LoginCheckInterceptor
 * Package: com.zjp.userservice.interceptor
 * Description:
 *
 * @Author zjp
 * @Create 2024/10/10 11:16
 * @Version 1.0
 */
@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求头
        String token = request.getHeader("Authorization");
        log.info("Authorization: {}", token);
        String auth = request.getHeader("Auth");
        log.info("Auth: {}", auth);
        return true;
    }
}
