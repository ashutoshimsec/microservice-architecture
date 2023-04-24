package com.ashu.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}

