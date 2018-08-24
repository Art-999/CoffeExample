package com.company;

public class Main {

    public static void main(String[] args) {
	Coffee simpleCoffee=new SimpleCoffee();
	simpleCoffee.makeCoffee();

	simpleCoffee=new SuggarDecorator(simpleCoffee);
	simpleCoffee.makeCoffee();

	simpleCoffee=new MilkDecorator(simpleCoffee);
	simpleCoffee.makeCoffee();
    }
}
