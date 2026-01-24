package com.zaki.store;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationService implements NotificationService {
  public void sendMessage(){
    System.out.println("EMAIL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
}
