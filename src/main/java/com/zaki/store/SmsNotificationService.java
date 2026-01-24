package com.zaki.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sms")
@Primary
public class SmsNotificationService implements NotificationService {
  public void sendMessage(){
    System.out.println("SMS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
}
