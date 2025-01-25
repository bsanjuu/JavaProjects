package com.bsanju.awselasticebanstalk;

import com.stripe.Stripe;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class StripeConfig {

    @PostConstruct
    public void init() {
        Stripe.apiKey = "pk_test_51Ql4dZB23wOOpnZLiIjnDONvCmLsIqLItrWNDZYJREMK1gG6vYtMk6MqZUhcgNNK9MN5jBI9nIU4i68v2KQbgOpN00rv5bgLLU";
    }
}
