package com.company;

public class SuggarDecorator extends CoffeeDecorator {
    public SuggarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSuggar();
    }

    private void addSuggar() {
        System.out.println("add sugar");
    }
}
