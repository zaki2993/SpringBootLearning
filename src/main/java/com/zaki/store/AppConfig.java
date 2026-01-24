package com.zaki.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public PaymentService strip(){
    return new StripPaymentService();
  }
  @Bean
  public PaymentService paypal(){
    return new PaypalPaymentService();
  }
  @Bean 
  public OrderService orderservice(){
    return new OrderService(strip());
  }
}
