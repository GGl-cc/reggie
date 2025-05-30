package com.itheima.reggie.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderComment {
    private Long id;
    private Long orderId; // 订单ID
    private Long userId; // 用户ID
    private String contentText; // 评论内容

    private LocalDateTime createTime; // 评论时间
}