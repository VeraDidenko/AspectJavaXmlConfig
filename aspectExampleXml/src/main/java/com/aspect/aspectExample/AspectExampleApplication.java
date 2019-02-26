package com.aspect.aspectExample;

import com.aspect.aspectExample.order.PizzaOrder;
import com.aspect.aspectExample.order.SushiOrder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectExampleApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		ctx.refresh();
		PizzaOrder pizzaOrder = ctx.getBean("pizzaOrder", PizzaOrder.class);
		System.out.println("_________________________\n");
		pizzaOrder.pizzaActivateOrder();
		System.out.println("_________________________\n");

		SushiOrder sushiOrder = ctx.getBean("sushiOrder", SushiOrder.class);
		System.out.println("_________________________\n");
		sushiOrder.sushiActivateOrder();
		System.out.println("_________________________\n");

		System.out.flush();
		ctx.close();

	}

}
