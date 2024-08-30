package za.ac.cput.factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentFactoryTest {

    @Test
    void buildPayment(){
        Payment payment = PaymentFactory.buildPayment("345678","Zovuyo", "zovuyombekeni11@icloud.com", "Visa", "12/26", "452","Credit Card",2500.00);
        Assertions.assertNotNull(payment);
        System.out.println(payment);
    }

}
