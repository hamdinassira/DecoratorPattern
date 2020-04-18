package com.decorator.pattern;

public class Espresso extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description="Espresso";
	}
	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return 1.69;
	}
	public double costMeduim() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	public double costLarge() {
		// TODO Auto-generated method stub
		return 2.19;
	}
}
