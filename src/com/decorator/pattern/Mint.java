package com.decorator.pattern;

public class Mint extends CondimentDecorator{
	Beverage beverage;
	
    public Mint(Beverage beverage) {
	// TODO Auto-generated constructor stub
	this.beverage=beverage;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" with Mint ";
	}

	@Override
	public double costSmall() {
		// TODO Auto-generated method stub
		return .15+beverage.costSmall();
	}
	@Override
	public double costMeduim() {
		// TODO Auto-generated method stub
		return .15+beverage.costMeduim();
	}
	@Override
	public double costLarge() {
		// TODO Auto-generated method stub
		return .15+beverage.costLarge();
	}

}
