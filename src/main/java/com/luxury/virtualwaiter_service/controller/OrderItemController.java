package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.model.OrderItem;
import com.luxury.virtualwaiter_service.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping("/add")
    public OrderItem addOrder(@RequestBody OrderItem orderItem) {
        return orderItemService.addOrderItem(orderItem);
    }
}
