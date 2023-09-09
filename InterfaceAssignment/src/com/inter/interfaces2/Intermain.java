package com.inter.interfaces2;

public class Intermain {

	public static void main(String[] args) {
		ICalculator icalc=new BasicCalculator();
		icalc.add(17,18);
		icalc.difference(20, 10);
		icalc.product(4, 5);
		icalc.divide(10, 5);
		
		IScientific iscient=new ScientificCalculator();
		iscient.square(2);
		iscient.cube(10);
		
	}

}
