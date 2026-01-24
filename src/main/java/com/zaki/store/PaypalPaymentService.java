package com.zaki.store;

import org.springframework.stereotype.Component;

public class PaypalPaymentService implements PaymentService {
  public void processService(float amount){
    System.out.println("Paypal");
    System.out.println("amount: "+amount);
  }
}
