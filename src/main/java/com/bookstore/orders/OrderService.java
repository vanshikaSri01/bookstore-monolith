package com.bookstore.orders;

import com.bookstore.orders.internal.OrderValidator;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderValidator validator;

    public OrderService(OrderValidator validator) {
        this.validator = validator;
    }

    public boolean validateOrder(String orderId) {
        return validator.isValid(orderId);
    }
}