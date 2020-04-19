package com.decorator.pattern;
/*
 * @author Hamdi Nassira
 */
public abstract class Beverage {
	String description;
	public abstract double  cost();

	public String getDescription() {
		return description;
	}
}
