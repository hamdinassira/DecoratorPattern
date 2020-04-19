package com.decorator.pattern;

public class DoubleMousse extends CondimentDecorator{
	Beverage beverage;
	
    public DoubleMousse(Beverage beverage) {
	// TODO Auto-generated constructor stub
	this.beverage=beverage;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" et DoubleMousse ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1+beverage.cost();
	}
	

}
