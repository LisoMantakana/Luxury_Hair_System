package za.ac.cput.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Payment;
import za.ac.cput.repository.PaymentRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaymentService implements IPaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Set<Payment> getall() {
        return paymentRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment read(String cardNumber) {
        return paymentRepository.findByCardNumber(cardNumber); // Adjust based on your repository method
    }

    @Override
    public Payment read(Payment payment) {
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        if (paymentRepository.existsById(payment.getCvv())) {
            return paymentRepository.save(payment);
        }
        return null;
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }
}
