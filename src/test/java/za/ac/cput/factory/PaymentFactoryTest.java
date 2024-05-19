package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentFactoryTest {

    @Test
    void buildPayment(){
        Payment payment = PaymentFactory.buildPayment("345678","A7803", "R700", "Cheque", "12-04-2024", "Approved");
        assertNotNull(payment);
        System.out.println(payment);
    }

}
