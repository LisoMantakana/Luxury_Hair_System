package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

public class PaymentFactory {

    public static Payment buildPayment(String paymentID, String orderID, String Amount, String paymentMethod,
                                       String transactionStatus, String transactionDate) {
        if (Helper.isNullOrEmpty(paymentID) || Helper.isNullOrEmpty(orderID) || Helper.isNullOrEmpty(Amount)
                || Helper.isNullOrEmpty(paymentMethod) || Helper.isNullOrEmpty(transactionStatus) || Helper.isNullOrEmpty(transactionDate))
            return null;

           return new Payment.Builder().setPaymentID(paymentID)
                   .setOrderID(orderID)
                   .setAmount(Amount)
                   .setPaymentMethod(paymentMethod)
                   .setTransationStatus(transactionStatus)
                   .setTransactionDate(transactionDate)
                   .build();
    }

}