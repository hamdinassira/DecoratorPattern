package com.decorator.pattern;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description="DarkRoast Small";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.5;
	}
	
	
}
