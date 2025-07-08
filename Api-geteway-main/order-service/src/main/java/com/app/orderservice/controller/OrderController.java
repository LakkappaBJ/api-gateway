package com.app.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public Map<String, Object> getOrder(@PathVariable String id) {
        Map<String, Object> order = new HashMap<>();
        order.put("id", id);
        order.put("product", "Product " + id);
        order.put("amount", 100.00);
        order.put("service", "order-service");
        return order;
    }

    @GetMapping
    public Map<String, Object> getAllOrders() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "All orders from order-service");
        response.put("service", "order-service");
        response.put("port", "8082");
        return response;
    }
}