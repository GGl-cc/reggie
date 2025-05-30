package com.itheima.reggie.service.impl;

import com.itheima.reggie.entity.OrderComment;
import com.itheima.reggie.mapper.OrderCommentMapper;
import com.itheima.reggie.service.OrderCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Service
public class OrderCommentServiceImpl implements OrderCommentService {

    private static final Logger log = LoggerFactory.getLogger(OrderCommentServiceImpl.class);
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
        log.info("返回模拟评论数据");
        List<OrderComment> mockComments = new ArrayList<>();
        OrderComment comment = new OrderComment();
        comment.setId(1L);
        comment.setOrderId(1L);
        comment.setUserId(1L);

        comment.setContentText("这是一条测试评论");
        comment.setCreateTime(LocalDateTime.now());
        mockComments.add(comment);
        return mockComments;
       // return orderCommentMapper.selectAll();
    }

    @Override
    public void deleteComment(Long commentId) {
        orderCommentMapper.deleteById(commentId);
    }
}