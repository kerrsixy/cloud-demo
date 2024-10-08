package com.zjp.orderservice.controller;

import com.zjp.orderservice.entity.Order;
import com.zjp.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderController
 * Package: com.zjp.orderservice.controller
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 16:48
 * @Version 1.0
 */
@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }
}
