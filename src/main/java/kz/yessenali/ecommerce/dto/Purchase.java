package kz.yessenali.ecommerce.dto;

import kz.yessenali.ecommerce.entity.Order;
import kz.yessenali.ecommerce.entity.OrderItem;
import kz.yessenali.ecommerce.entity.Customer;
import kz.yessenali.ecommerce.entity.Address;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
