package com.kodluyoruz.mbtuncer;


public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Lessi", "Anywhere on the earth", 15,60,35);

        printSkills(dog);
    }

    static void printSkills(Animal animal){
        if (animal instanceof Flyer){
            ((Flyer) animal).fly();
        }
        if (animal instanceof Swimmer){
            ((Swimmer) animal).swim();
        }
        if (animal instanceof Runner){
            ((Runner) animal).run();
        }
    }
}
