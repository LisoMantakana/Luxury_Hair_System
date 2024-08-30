package za.ac.cput.controller;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PaymentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8080/api/payments";
    private static Payment payment;
    private Object postResponse;

    @BeforeEach
    @Order(1)
    public void setup() {
        payment =  PaymentFactory.buildPayment("24589658","Zovuyo","zovuyombekeni11@icloud.com","MasterCard","12/35","452","Master Card",2500.00);
    }

    @Test
    @Order(2)
    void create(){
        String url = BASE_URL + "/create";
        ResponseEntity<Payment> response = restTemplate.postForEntity(url, payment, Payment.class);
        assertNotNull(postResponse);
        assertNotNull(response.getBody());
        assertEquals(HttpStatus.CREATED, response.getStatusCode());

        Payment payementSaved = response.getBody();
        assertEquals(payment.getCardNumber(), payementSaved.getCardNumber());
        System.out.println("Saved data: " + payementSaved);


    }
    @Test
    @Order(3)
    void read(){
        String cardNumber = "531456";
        String url = BASE_URL + "/getall" + cardNumber;
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Payment> response = restTemplate.exchange(url, HttpMethod.GET, entity, Payment.class);
        System.out.println("Display payment: " + cardNumber);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
    }

    @Test
    @Order(4)
    void update(){
        String url = BASE_URL + "/update";
        Payment newPayment = new Payment.Builder().copy(payment).setCvv("452").build();
        ResponseEntity<Payment> postResponse = restTemplate.postForEntity(url, newPayment, Payment.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Payment updated = postResponse.getBody();
        assertEquals(payment.getCardNumber(), updated.getCardNumber());
        System.out.println("Updated data: " + updated);
    }

    @Test
    @Order(5)
    void getall(){
        String url = BASE_URL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Payment> response = restTemplate.exchange(url, HttpMethod.GET, entity, Payment.class);

        System.out.println("Display paymeny:");
        System.out.println(response.getBody());
        assertNotNull(response.getBody());
    }

    @Test
    @Order(6)
    void delete(){
        String url = BASE_URL + "/delete";
        System.out.println("URL: " + url);
        restTemplate.delete(url);
        System.out.println("Successfully deleted");
    }
}
