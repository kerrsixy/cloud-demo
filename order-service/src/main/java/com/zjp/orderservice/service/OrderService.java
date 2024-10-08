package com.zjp.orderservice.service;

import com.zjp.orderservice.entity.Order;

/**
 * ClassName: OrderService
 * Package: com.zjp.orderservice.service
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 16:50
 * @Version 1.0
 */
public interface OrderService {
    Order getOrderById(Long id);
}
