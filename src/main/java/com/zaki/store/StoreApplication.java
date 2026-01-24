package com.zaki.store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StoreApplication.class, args);
    var orderservice = context.getBean(OrderService.class);
    orderservice.palceOrder();
	}
}
