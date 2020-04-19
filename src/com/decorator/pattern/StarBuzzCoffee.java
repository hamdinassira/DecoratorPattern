package com.decorator.pattern;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Beverage b=new EspressoLarge();
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.cost()+" $.");
	System.out.println("***************************************");
	b=new Milk(b);
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.cost()+" $.");
	System.out.println("***************************************");
	b=new DoubleMousse(b);
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.cost()+" $.");
	System.out.println("***************************************");
	Beverage b1=new HouseBlendLarge();
	System.out.println("Vous avez choisi "+b1.getDescription()+" a "+b1.cost()+" $.");
	System.out.println("***************************************");
	Beverage b11=new HouseBlendMeduim();
	System.out.println("Vous avez choisi "+b11.getDescription()+" a "+b11.cost()+" $.");
	System.out.println("***************************************");
	Beverage b111=new HouseBlend();
	System.out.println("Vous avez choisi "+b111.getDescription()+" a "+b111.cost()+" $.");
	System.out.println("***************************************");
	b1=new Milk(b11);
	System.out.println("Vous avez choisi "+b11.getDescription()+" a "+b11.cost()+" $.");
	System.out.println("***************************************");
    Beverage	b2=new Citronade();
    System.out.println("Vous avez choisi "+b2.getDescription()+" a "+b2.cost()+" $.");
    System.out.println("***************************************");
    b2=new Mint(b2);
	System.out.println("Vous avez choisi "+b2.getDescription()+" a "+b2.cost()+" $.");
	}
}
