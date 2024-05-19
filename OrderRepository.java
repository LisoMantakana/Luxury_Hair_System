package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {
    Order findOrderByOrderId(String orderId);
    void deleteOrderByCustomerId(String customerId);
    void deleteOrderByProductId(List<String> productId);

}
