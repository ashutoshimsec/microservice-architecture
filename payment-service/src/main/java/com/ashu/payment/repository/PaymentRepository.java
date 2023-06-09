package com.ashu.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

