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
	public double cost() {
		// TODO Auto-generated method stub
		return .15+beverage.cost();
	}
	

}
