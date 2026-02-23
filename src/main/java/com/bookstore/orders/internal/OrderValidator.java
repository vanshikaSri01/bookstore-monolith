package com.bookstore.orders.internal;

import org.springframework.stereotype.Component;

@Component
public class OrderValidator {

    public boolean isValid(String orderId) {
        return orderId != null && !orderId.isBlank();
    }
}