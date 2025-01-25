package com.bsanju.awselasticebanstalk;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public Map<String, String> createPaymentIntent(@RequestBody Map<String, Object> request) throws StripeException {
        int amount = (int) request.get("amount"); // Amount in cents
        Map<String, Object> params = new HashMap<>();
        params.put("amount", amount);
        params.put("currency", "usd");
        params.put("payment_method_types", new String[]{"card"});

        PaymentIntent paymentIntent = PaymentIntent.create(params);

        Map<String, String> response = new HashMap<>();
        response.put("clientSecret", paymentIntent.getClientSecret());
        return response;
    }
}
