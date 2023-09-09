package com.inter.interfaces3;

import java.util.function.BiConsumer;

public class Biconsumerinter {

	public static void main(String[] args) {
		BiConsumer<String,Integer> biConsumer=(name,age)->{
			if(name.equals("Admin")&& age>30) {
				System.out.println("Welcome Admin");
			}else {
				System.out.println("wrong user");
			}
		};
		biConsumer.accept("Admin", 20);
	
	}

}
