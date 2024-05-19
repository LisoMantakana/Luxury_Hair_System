package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.util.Date;
import java.util.List;

public class OrderFactory {
    public static Order buildOrder(String orderId, String customerId, List<String> productId, int quantity, double totalPrice, Date orderDateTime, String shippingAddress, String status, String shippingMethod, String paymentId){
        if (Helper.isNullOrEmpty(orderId)||Helper.isNullOrEmpty(customerId)||Helper.isNullOrEmpty(String.valueOf(productId))||Helper.isNullOrEmpty(String.valueOf(quantity))||Helper.isNullOrEmpty(String.valueOf(totalPrice))||Helper.isNullOrEmpty(String.valueOf(orderDateTime))||Helper.isNullOrEmpty(shippingAddress)||Helper.isNullOrEmpty(shippingMethod)||Helper.isNullOrEmpty(paymentId))
            return null;
        return new Order.Builder().setOrderId(orderId)
                .setCustomerId(customerId)
                .setProductId(productId)
                .setQuantity(quantity)
                .setTotalPrice(totalPrice)
                .setStatus(status)
                .setOrderDateTime(orderDateTime)
                .setShippingAddress(shippingAddress)
                .setShippingMethod(shippingMethod).setPaymentId(paymentId)
                .build();


        }

    public static Order buildOrder(String a5674, String b234, String d4567, String number, String s, String s1, String shippingAddress, String pending, String courier, String g345) {

        return null;
    }

}

