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
	public double costSmall() {
		// TODO Auto-generated method stub
		return 1+beverage.costSmall();
	}
	@Override
	public double costMeduim() {
		// TODO Auto-generated method stub
		return 1+beverage.costMeduim();
	}
	@Override
	public double costLarge() {
		// TODO Auto-generated method stub
		return 1+beverage.costLarge();
	}
	

}
