package com.itheima.reggie.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderComment {
    private Long id;
    private Long orderId; // 订单ID
    private Long userId; // 用户ID
    private String content; // 评论内容
    private int score; // 打分
    private LocalDateTime createTime; // 评论时间
}