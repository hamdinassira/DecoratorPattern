package com.decorator.pattern;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description="HouseBlend";
	}
	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return .79;
	}
	@Override
	public double costMeduim() {
		// TODO Auto-generated method stub
		return .89;
	}
	@Override
	public double costLarge() {
		// TODO Auto-generated method stub
		return .99;
	}
}
