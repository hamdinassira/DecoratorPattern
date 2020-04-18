package com.decorator.pattern;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
    public Whip(Beverage beverage) {
	// TODO Auto-generated constructor stub
	this.beverage=beverage;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" with Whip";
	}

	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return .10+beverage.costSmall();
	}
	public double costMeduim() {
		// TODO Auto-generated method stub
		return .10+beverage.costMeduim();
	}
	public double costLarge() {
		// TODO Auto-generated method stub
		return .10+beverage.costLarge();
	}
}
