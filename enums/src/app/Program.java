package app;


import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1, new Date(), OrderStatus.PAYMENT_PENDING);
		
		System.out.println(order.toString());
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
