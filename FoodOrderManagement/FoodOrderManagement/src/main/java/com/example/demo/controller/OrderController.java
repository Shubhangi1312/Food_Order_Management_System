package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
		 @Autowired
		    private OrderService orderService;

		    @PostMapping
		    public Order placeOrder(@RequestBody Order order) {
		        return orderService.saveOrder(order);
		    }

		    @GetMapping("/{userId}")
		    public List<Order> getUserOrders(@PathVariable Long userId) {
		        return orderService.getUserOrders(userId);
		    }
		}


