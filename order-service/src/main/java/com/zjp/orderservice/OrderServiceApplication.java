package com.zjp.orderservice;

import com.zjp.feginservice.client.UserClient;
import com.zjp.feginservice.config.DefaultFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderServiceApplication
 * Package: com.zjp.orderservice
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 10:59
 * @Version 1.0
 */
//@EnableFeignClients(clients = {UserClient.class}, defaultConfiguration = DefaultFeignConfiguration.class)
//@EnableFeignClients(basePackages = "com.zjp.feginservice.client")
@EnableFeignClients(clients = {UserClient.class}, defaultConfiguration = DefaultFeignConfiguration.class)
@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
