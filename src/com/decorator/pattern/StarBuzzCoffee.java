package com.decorator.pattern;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Beverage b=new Espresso();
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.costSmall()+" $.");
	System.out.println("***************************************");
	b=new Milk(b);
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.costMeduim()+" $.");
	System.out.println("***************************************");
	b=new DoubleMousse(b);
	System.out.println("Vous avez choisi "+b.getDescription()+" a "+b.costLarge()+" $.");
	System.out.println("***************************************");
	Beverage b1=new HouseBlend();
	System.out.println("Vous avez choisi "+b1.getDescription()+" a "+b1.costMeduim()+" $.");
	System.out.println("***************************************");
	b1=new Milk(b1);
	System.out.println("Vous avez choisi "+b1.getDescription()+" a "+b1.costLarge()+" $.");
	System.out.println("***************************************");
    Beverage	b2=new Citronade();
    System.out.println("Vous avez choisi "+b2.getDescription()+" a "+b2.costSmall()+" $.");
    System.out.println("***************************************");
    b2=new Mint(b2);
	System.out.println("Vous avez choisi "+b2.getDescription()+" a "+b2.costMeduim()+" $.");
	}
}
