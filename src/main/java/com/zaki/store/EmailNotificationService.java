package com.zaki.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationService implements NotificationService {
  @Value("${stripe.timout}")
  private int timout;
  public void sendMessage(){
    System.out.println("EMAIL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println("timeout: "+timout);
  }
}
