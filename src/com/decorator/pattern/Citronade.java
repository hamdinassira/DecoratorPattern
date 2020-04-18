package com.decorator.pattern;

public class Citronade extends Beverage{

	public Citronade() {
		// TODO Auto-generated constructor stub
		description="Citronade";
	}

public double costSmall() {
	return 4;
}

public double costMeduim() {
	return 4.5;
}
public double costLarge() {
	return 5;
}
}
