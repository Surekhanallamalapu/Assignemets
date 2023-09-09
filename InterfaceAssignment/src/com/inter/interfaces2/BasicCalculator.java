package com.inter.interfaces2;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("additon="+(x+y));
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("difference="+(x-y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("product="+(x*y));
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("divide="+(x/y));
	}

}
