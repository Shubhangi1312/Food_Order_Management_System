package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
		  @Autowired
		    private PaymentService paymentService;

		    @PostMapping
		    public Payment makePayment(@RequestBody Payment payment) {
		        return paymentService.processPayment(payment);
		    
		}

		
	}


