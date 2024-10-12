package com.zjp.feginservice.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * ClassName: DefaultFeignConfiguration
 * Package: com.zjp.feginservice.config
 * Description:
 *
 * @Author zjp
 * @Create 2024/10/8 17:14
 * @Version 1.0
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}
