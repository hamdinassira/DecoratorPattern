package com.decorator.pattern;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description="DarkRoast";
	}
	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	@Override
	public double costMeduim() {
		// TODO Auto-generated method stub
		return 2.5;
	}
	@Override
	public double costLarge() {
		// TODO Auto-generated method stub
		return 3;
	}
}
