package com.zjp.orderservice.entity;

import com.zjp.common.entity.User;
import lombok.Data;

/**
 * ClassName: Order
 * Package: com.zjp.orderservice.entity
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 16:51
 * @Version 1.0
 */
@Data
public class Order {
    private Long id;
    private Long userId;
    private String name;
    private Double price;
    private Integer num;
    private User user;
}
