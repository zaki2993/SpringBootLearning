package com.zaki.store;
public class PaypalPaymentService implements PaymentService {
  public void processService(float amount){
    System.out.println("Paypal");
    System.out.println("amount: "+amount);
  }
}
