package com.company;

public class Client {

    private AbstractProductA abstractProductA;
    private AbstractProductB abstractProductB;

    public Client(AbstractFactory factory) {
        abstractProductB = factory.createProductB();
        abstractProductA = factory.createProductA();
    }

    public void run() {
        abstractProductB.interact(abstractProductA);
    }
}
