package com.thuanpv1731103117.tuan07.dongvat;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Con chó:");
        dog.picture();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();
        dog.animalType();
        dog.living();
        dog.function();
        System.out.println("---");

        Cat cat = new Cat();
        System.out.println("Con mèo");
        cat.picture();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();
        cat.animalType();
        cat.living();
        cat.batChuot();
        System.out.println("---");


    }
    
}
