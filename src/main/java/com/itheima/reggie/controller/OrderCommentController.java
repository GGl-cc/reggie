package com.itheima.reggie.controller;

import com.itheima.reggie.entity.OrderComment;
import com.itheima.reggie.service.OrderCommentService;
import com.itheima.reggie.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderComment")
public class OrderCommentController {

    @Autowired
    private OrderCommentService orderCommentService;

    /**
     * 新增评论
     */
    @PostMapping
    public R<String> saveComment(@RequestBody OrderComment comment) {
        orderCommentService.saveComment(comment);
        return R.success("评论提交成功");
    }

    /**
     * 根据订单 ID 获取评论
     */
    @GetMapping("/{orderId}")
    public R<List<OrderComment>> getCommentsByOrderId(@PathVariable Long orderId) {
        List<OrderComment> comments = orderCommentService.getCommentsByOrderId(orderId);
        return R.success(comments);
    }

    /**
     * 获取所有评论（管理端使用）
     */
    @GetMapping("/all")
    public R<List<OrderComment>> getAllComments() {
        List<OrderComment> comments = orderCommentService.getAllComments();
        return R.success(comments);
    }

    /**
     * 删除评论（管理端使用）
     */
    @DeleteMapping("/{commentId}")
    public R<String> deleteComment(@PathVariable Long commentId) {
        orderCommentService.deleteComment(commentId);
        return R.success("评论删除成功");
    }
}