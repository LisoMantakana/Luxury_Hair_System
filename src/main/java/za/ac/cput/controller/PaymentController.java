package za.ac.cput.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.services.IPaymentService;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController{
    private final IPaymentService paymentService;
    @Autowired
    public PaymentController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment) throws IllegalAccessException {
        return paymentService.create(payment);
    }
    @GetMapping("/read/{cardNumber}")
    public Payment readPayment(@PathVariable String cardNumber) {
        return paymentService.read(cardNumber);
    }
    @PutMapping("/update")
    public Payment update(@RequestBody Payment payment) throws IllegalAccessException {
        return paymentService.update(payment);
    }
    @GetMapping("/getall")
    public List<Payment> getAll() {
        return paymentService.getAll();
    }
}

