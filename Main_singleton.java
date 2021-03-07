package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Dana");
        Singleton singleton2 = Singleton.getInstance("Kopzhassarova");
        System.out.println(singleton1.data);
        System.out.println(singleton2.data);
    }
}
