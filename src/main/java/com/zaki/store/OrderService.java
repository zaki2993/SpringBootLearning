package com.zaki.store;
public class OrderService {
  private PaymentService paymentService;
  public OrderService(PaymentService paymentService){
    this.paymentService=paymentService;
  }
  public void palceOrder(){
    paymentService.processService(1111);
  }
}

