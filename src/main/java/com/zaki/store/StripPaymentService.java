package com.zaki.store;

import org.springframework.stereotype.Component;

@Component
public class StripPaymentService implements PaymentService {
  public void processService(float amount){
    System.out.println("Stripe");
    System.out.println("amount: "+amount);
  }
}
