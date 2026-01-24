package com.zaki.store;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
  private PaymentService paymentService;
public OrderService(PaymentService paymentService){
    this.paymentService=paymentService;
  }
  public void palceOrder(){
    paymentService.processService(1111);
  }
}

