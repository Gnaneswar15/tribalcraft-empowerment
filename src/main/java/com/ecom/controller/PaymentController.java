package com.ecom.controller;  // Use your package name here

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {

    // This method handles the request to the online payment page
    @GetMapping("/online-payment")
    public String onlinePaymentPage() {
        return "online-payment"; // This corresponds to online-payment.html
    }

    // Optionally, handle form submission here if needed
    @PostMapping("/submit-payment")
    public String submitPayment(@RequestParam String cardNumber, @RequestParam String expiryDate, 
                                @RequestParam String cvv, @RequestParam String upiId) {
        // Handle payment submission logic here, like processing payment, etc.
        // After payment, redirect or show a success message
        return "payment-success"; // or another page showing payment status
    }
}
