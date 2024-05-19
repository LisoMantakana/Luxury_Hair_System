package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Payment {
    @Id
    private String paymentID;
    private String orderID;
    private String Amount;
    private String paymentMethod;
    private String transactionDate;
    private String transactionStatus;


    public Payment() {
    }

    public Payment(Builder builder) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.Amount = Amount;
        this.paymentMethod = paymentMethod;
        this.transactionDate = transactionDate;
        this.transactionStatus = transactionStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getAmount() {
        return Amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(paymentID, payment.paymentID) && Objects.equals(orderID, payment.orderID) && Objects.equals(Amount, payment.Amount) && Objects.equals(paymentMethod, payment.paymentMethod) && Objects.equals(transactionDate, payment.transactionDate) && Objects.equals(transactionStatus, payment.transactionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID, orderID, Amount, paymentMethod, transactionDate, transactionStatus);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", Amount='" + Amount + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                '}';
    }

    public Product.Builder Builder() {
        return null;
    }

    public static class Builder{
        private String paymentID;
        private String orderID;
        private String Amount;
        private String paymentMethod;
        private String transactionDate;
        private String transactionStatus;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setOrderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setAmount(String amount) {
            Amount = amount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        //public Builder setTransactionStatus(String transactionStatus) {
           // this.transactionStatus = transactionStatus;
            //return this;
        //}
        public Payment build(){
            return new Payment(this);

        }


        public Builder setTransationStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }
    }
}
