package com.zjp.userservice.mapper;

import com.zjp.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.zjp.userservice.mapper
 * Description:
 *
 * @Author zjp
 * @Create 2024/9/30 11:30
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    User selectUserById(Long id);
}
