package com.itheima.reggie.controller;

import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.OrderComment;
import com.itheima.reggie.service.OrderCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@RestController
@RequestMapping("/order/comment")
public class OrderCommentController {

    @Autowired
    private OrderCommentService orderCommentService;

    @PostMapping
    public R<String> addComment(@RequestBody OrderComment orderComment) {
        orderCommentService.save(orderComment);
        return R.success("评论成功");
    }
    @GetMapping("/list")
    public R<List<OrderComment>> getCommentList() {
        LambdaQueryWrapper<OrderComment> queryWrapper = new LambdaQueryWrapper<>();
        List<OrderComment> list = orderCommentService.list(queryWrapper);
        return R.success(list);
    }
}