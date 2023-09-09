package com.inter.interfaces1;

public class ShapeMain {

	public static void main(String[] args) {
		Shape claculator=(x,y)->
		{
			System.out.println(" Rect area="+(x*y));
		};
		claculator.area(10, 3);
		Shape claculator1=(x,y)->
		{
			System.out.println("Triangle area="+(0.5*(x*y)));
		};
		claculator1.area(1, 3);
		Shape claculator2=(x,y)->
		{
			System.out.println("Square="+(x*y));
		};
		claculator2.area(44, 22);
	}

}
