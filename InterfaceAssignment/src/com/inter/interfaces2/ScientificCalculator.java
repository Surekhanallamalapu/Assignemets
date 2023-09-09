package com.inter.interfaces2;

public class ScientificCalculator extends BasicCalculator implements IScientific {

	@Override
	public void square(int x) {
		System.out.println("square="+(x*x));
	}

	@Override
	public void cube(int x) {
		System.out.println("cube="+(x*x*x));
	}

}
