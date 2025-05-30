package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.OrderComment;
import com.itheima.reggie.mapper.OrderCommentMapper;
import com.itheima.reggie.service.OrderCommentService;
import org.springframework.stereotype.Service;

@Service
public class OrderCommentServiceImpl extends ServiceImpl<OrderCommentMapper, OrderComment> implements OrderCommentService {
}