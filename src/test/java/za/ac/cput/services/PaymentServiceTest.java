package za.ac.cput.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    Payment payment;

    @BeforeEach
    void setUp() {

        payment = PaymentFactory.buildPayment("589656477", "Lunga", "NohaseL9@gmail.com",
                "Debit Card", "05/29", "254", "Visa",2000.00);
        assertNotNull(payment);
        System.out.println(payment);
    }


    @Test
    @Order(1)
    void create() {
        Payment create = paymentService.create(payment);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    @Order(2)
    void read() {
        Payment read = paymentService.read(payment.getCardNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Payment updatePayment = new Payment().Builder().copy(payment).setCvv("256").build();
        Payment updated = paymentService.update(updatePayment);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getall() {
        System.out.println(paymentService.getall());

    }
}