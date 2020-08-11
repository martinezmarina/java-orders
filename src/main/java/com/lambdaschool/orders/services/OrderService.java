package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;

public interface OrderService {
    Order findOrderById(long id);
}
