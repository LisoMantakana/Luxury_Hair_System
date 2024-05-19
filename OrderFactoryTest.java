package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Order;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderFactoryTest {

    @Test
    void buildOrder() {
        Order order;
        order = OrderFactory.buildOrder("A5674","B234","D4567","3","650.95","10/02","12 Wrench street","Pending","Courier","G345");
        assertNotNull(order);
        System.out.println(order);
    }


}