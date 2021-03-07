package com.company;

public class ProductB2 implements AbstractProductB {

    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getSimpleName() + " interacts with " + a.getClass().getSimpleName());
    }

}
