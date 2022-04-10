package com.coffeepoweredcrew.templatemethod;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
        Order order = new Order("1001");
        order.addItem("soda", 2.50);
        order.addItem("sandwich", 11.90);
        order.addItem("Pizza", 15.85);
        
        OrderPrinter printer = new TextPrinter();
        OrderPrinter printer2 = new HtmlPrinter();
        
        printer.printOrder(order, "1001.txt");
        printer2.printOrder(order, "1001.html");
	}
}
