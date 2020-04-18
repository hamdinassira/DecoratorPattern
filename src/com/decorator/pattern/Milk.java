package com.decorator.pattern;

public class Milk extends CondimentDecorator{
	Beverage beverage;
	
    public Milk(Beverage beverage) {
	// TODO Auto-generated constructor stub
	this.beverage=beverage;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" with Milk ";
	}

	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return .20+beverage.costSmall();
	}
	public double costMeduim() {
		// TODO Auto-generated method stub
		return .20+beverage.costMeduim();
	}
	public double costLarge() {
		// TODO Auto-generated method stub
		return .20+beverage.costLarge();
	}

}
