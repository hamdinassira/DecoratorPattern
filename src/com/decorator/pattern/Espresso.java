package com.decorator.pattern;

public class Espresso extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description="Espresso Small ";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.89;
	}

}
