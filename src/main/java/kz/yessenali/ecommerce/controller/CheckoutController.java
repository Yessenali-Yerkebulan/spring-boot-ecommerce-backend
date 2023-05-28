package kz.yessenali.ecommerce.controller;


import kz.yessenali.ecommerce.dto.Purchase;
import kz.yessenali.ecommerce.dto.PurchaseResponse;
import kz.yessenali.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://lcaohsot:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
