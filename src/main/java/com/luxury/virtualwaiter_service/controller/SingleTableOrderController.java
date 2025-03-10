package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.model.SingleTableOrder;
import com.luxury.virtualwaiter_service.service.SingleTableOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleTableOrder")
public class SingleTableOrderController {

    private final SingleTableOrderService singleTableOrderService;

    @Autowired
    public SingleTableOrderController(SingleTableOrderService singleTableOrderService) {
        this.singleTableOrderService = singleTableOrderService;
    }

    @PostMapping("/add")
    public SingleTableOrder addSingleTableOrder(@RequestBody SingleTableOrder singleTableOrder) {
        return singleTableOrderService.saveSingleTableOrder(singleTableOrder);
    }
}
