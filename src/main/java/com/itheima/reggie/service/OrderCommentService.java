package com.itheima.reggie.service;

import com.itheima.reggie.entity.OrderComment;

import java.util.List;

public interface OrderCommentService {
    void saveComment(OrderComment comment);
    List<OrderComment> getCommentsByOrderId(Long orderId);
    List<OrderComment> getAllComments();
    void deleteComment(Long commentId);
}