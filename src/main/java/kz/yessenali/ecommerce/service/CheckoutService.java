package kz.yessenali.ecommerce.service;

import kz.yessenali.ecommerce.dto.Purchase;
import kz.yessenali.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
