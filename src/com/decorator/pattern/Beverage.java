package com.decorator.pattern;
/*
 * @author Hamdi Nassira
 */
public abstract class Beverage {
	String description;
	public abstract double  costSmall();
	public abstract double  costMeduim();
	public abstract double  costLarge();
	public String getDescription() {
		return description;
	}
}
