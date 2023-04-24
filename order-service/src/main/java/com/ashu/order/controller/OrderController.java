package com.ashu.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.order.common.TransactionRequest;
import com.ashu.order.common.TransactionResponse;
import com.ashu.order.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;
    
    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        try {
			return service.saveOrder(request);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
}
