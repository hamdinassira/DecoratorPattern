package com.decorator.pattern;

public class EspressoLarge extends Beverage{

	public EspressoLarge() {
		// TODO Auto-generated constructor stub
		description="Espresso  Large";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.19;
	}

}
