package com.zjp.orderservice.service.impl;

import com.zjp.common.entity.User;
import com.zjp.feginservice.client.UserClient;
import com.zjp.orderservice.entity.Order;
import com.zjp.orderservice.mapper.OrderMapper;
import com.zjp.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: OrderServiceImpl
 * Package: com.zjp.orderservice.service.impl
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 16:50
 * @Version 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;
    private final UserClient userClient;

    @Override
    public Order getOrderById(Long id) {
        Order order = orderMapper.selectOrderById(id);
        User user = userClient.getUser(order.getUserId());
        order.setUser(user);
        return order;
    }
}
