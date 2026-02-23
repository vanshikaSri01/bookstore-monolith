package com.bookstore.inventory;

import com.bookstore.orders.OrderService;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final OrderService orderService;

    public InventoryService(OrderService orderService) {
        this.orderService = orderService;
    }

    public boolean checkInventory(String orderId) {
        return orderService.validateOrder(orderId);
    }
}