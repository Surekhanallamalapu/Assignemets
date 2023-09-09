package com.inter.interfaces3;
import java.util.function.Consumer;
public class Consumer1 {

	public static void main(String[] args) {
		Consumer<Integer> consumer = a -> {
			int b = 20;
			System.out.println(a + b);
		};
		consumer.accept(20);
		
	}
}
