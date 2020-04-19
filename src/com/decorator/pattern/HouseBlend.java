package com.decorator.pattern;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description="HouseBlend Small";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .79;
	}

}
