package com.zaki.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class NotificationManager {
  private NotificationService notificationService;
  public NotificationManager(@Qualifier("email") NotificationService notificationService){
    this.notificationService=notificationService;
  }
  public void send(){
    notificationService.sendMessage();
  }
}
