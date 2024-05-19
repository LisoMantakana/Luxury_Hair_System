package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
public class Order {
    @Id
    private String orderId;
    private String customerId;
    @SuppressWarnings("JpaAttributeTypeInspection")
    private List<String> productId;
    private  int quantity;
    private double totalPrice;
    private Date orderDateTime;
    private String status;
    private String shippingAddress;
    private String shippingMethod;
    private String paymentId;

    public Order(Order order){

    }
    public Order(Builder builder){
        this.orderId=builder.orderId;
        this.customerId=builder.customerId;
        this.productId=builder.productId;
        this.quantity=builder.quantity;
        this.totalPrice=builder.totalPrice;
        this.orderDateTime=builder.orderDateTime;
        this.status=builder.status;
        this.shippingAddress=builder.shippingAddress;
        this.shippingMethod=builder.shippingMethod;
        this.paymentId=builder.paymentId;
    }

    public Order() {

    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }

    public String getStatus() {
        return status;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public String getPaymentId() {
        return paymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return quantity == order.quantity && Double.compare(totalPrice, order.totalPrice) == 0 && Objects.equals(orderId, order.orderId) && Objects.equals(customerId, order.customerId) && Objects.equals(productId, order.productId) && Objects.equals(orderDateTime, order.orderDateTime) && Objects.equals(status, order.status) && Objects.equals(shippingAddress, order.shippingAddress) && Objects.equals(shippingMethod, order.shippingMethod) && Objects.equals(paymentId,order.paymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, productId, quantity, totalPrice, orderDateTime, status, shippingAddress, shippingMethod,paymentId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", orderDateTime=" + orderDateTime +
                ", status='" + status + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", shippingMethod='" + shippingMethod + '\'' +
                ",paymentId='"+paymentId+'\''+
                '}';
    }
    public static class Builder{
        private String orderId;
        private String customerId;
        private List<String> productId;
        private  int quantity;
        private double totalPrice;
        private Date orderDateTime;
        private String status;
        private String shippingAddress;
        private String shippingMethod;
        private String paymentId;

       public Builder setOrderId(String orderId){
           this.orderId=orderId;
           return this;
       }
       public Builder setProductId(List<String> productId){
           this.productId= productId;
           return this;
       }
       public Builder setCustomerId(String customerId){
           this.customerId=customerId;
           return this;
       }
       public Builder setQuantity(int quantity){
           this.quantity=quantity;
           return this;
       }
       public Builder setTotalPrice(double totalPrice){
           this.totalPrice=totalPrice;
           return this;
       }
       public Builder setStatus(String status){
           this.status=status;
           return this;
       }
       public Builder setShippingMethod(String shippingMethod){
           this.shippingMethod=shippingMethod;
           return this;
       }
       public Builder setShippingAddress(String shippingAddress){
           this.shippingAddress=shippingAddress;
           return this;
       }
       public Builder setOrderDateTime(Date orderDateTime){
           this.orderDateTime=orderDateTime;
           return this;
       }
       public Builder setPaymentId(String paymentId){
           this.paymentId=paymentId;
           return this;
       }

        public Order build() {
            return null;
        }

        public Builder copy(Order order2) {
            return null;
        }
    }
    public Order copy(Order order){
        this.orderId= order.orderId;
        this.customerId=order.customerId;
        this.productId=order.productId;
        this.quantity=order.quantity;
        this.totalPrice=order.totalPrice;
        this.orderDateTime=order.orderDateTime;
        this.status=order.status;
        this.shippingAddress=order.shippingAddress;
        this.shippingMethod=order.shippingMethod;
        this.paymentId=order.paymentId;
        return this;
    }
    public Order build(){
        return new Order(this);
    }
}
