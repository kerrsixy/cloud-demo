package com.zjp.orderservice.mapper;

import com.zjp.orderservice.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: OrderMapper
 * Package: com.zjp.orderservice.mapper
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 16:51
 * @Version 1.0
 */
@Mapper
public interface OrderMapper {

    Order selectOrderById(Long id);
}
