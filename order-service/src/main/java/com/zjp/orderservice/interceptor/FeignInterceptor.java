package com.zjp.orderservice.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * ClassName: FeignInterceptor
 * Package: com.zjp.feginservice.interceptor
 * Description:
 *
 * @Author zjp
 * @Create 2024/10/10 14:21
 * @Version 1.0
 */
@Slf4j
@Component
public class FeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        log.info("===request: {}", requestTemplate.url());
        log.info("Request URL: {}", request.getRequestURL());
        log.info("Request Method: {}", request.getMethod());
        log.info("Request Headers: {}", request.getHeaderNames());
        // 设置请求头
        requestTemplate.header("Auth", "Bearer token");
        // 将上游请求头全部设置到下游请求中
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            requestTemplate.header(name, value);
        }
    }
}
