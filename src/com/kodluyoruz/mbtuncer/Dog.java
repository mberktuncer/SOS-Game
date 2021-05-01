package com.kodluyoruz.mbtuncer;

public class Dog extends Animal implements Runner, Swimmer{
    public Dog(String name, String mainland, int averageLife, double averageHeight, double averageWeight){
        super(name, mainland, averageLife, averageHeight,averageWeight);
    }
    public void run(){
        System.out.println("A dog can run");
    }
    public void swim(){
        System.out.println("A dog can swim");
    }
}
