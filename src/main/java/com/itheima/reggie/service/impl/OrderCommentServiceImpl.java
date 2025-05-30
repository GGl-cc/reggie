package com.itheima.reggie.service.impl;

import com.itheima.reggie.entity.OrderComment;
import com.itheima.reggie.mapper.OrderCommentMapper;
import com.itheima.reggie.service.OrderCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderCommentServiceImpl implements OrderCommentService {

    @Autowired
    private OrderCommentMapper orderCommentMapper;

    @Override
    public void saveComment(OrderComment comment) {
        orderCommentMapper.insert(comment);
    }

    @Override
    public List<OrderComment> getCommentsByOrderId(Long orderId) {
        return orderCommentMapper.selectByOrderId(orderId);
    }

    @Override
    public List<OrderComment> getAllComments() {
        return orderCommentMapper.selectAll();
    }

    @Override
    public void deleteComment(Long commentId) {
        orderCommentMapper.deleteById(commentId);
    }
}