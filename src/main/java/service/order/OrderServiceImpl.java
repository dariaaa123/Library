package service.order;

import model.Order;
import repository.order.OrderRepository;

public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean save(Order order) {
        return orderRepository.create(order);
    }
}
