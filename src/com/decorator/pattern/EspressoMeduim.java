package com.decorator.pattern;

public class EspressoMeduim extends Beverage{

	public EspressoMeduim() {
		// TODO Auto-generated constructor stub
		description="Espresso Meduim";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
