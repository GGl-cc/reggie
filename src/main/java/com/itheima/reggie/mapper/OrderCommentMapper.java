package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.OrderComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderCommentMapper extends BaseMapper<OrderComment> {
    List<OrderComment> selectAll();

    List<OrderComment> selectByOrderId(Long orderId);
}
