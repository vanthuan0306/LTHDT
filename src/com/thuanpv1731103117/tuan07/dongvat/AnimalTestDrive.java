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

        Lion lion = new Lion();
        System.out.println("Con sư tử");
        lion.picture();
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();
        lion.animalType();
        lion.living();
        lion.sanMoi();
        System.out.println("---");

        Tiger tiger = new Tiger();
        System.out.println("con hổ");
        tiger.picture();
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();
        tiger.animalType();
        tiger.living();
        tiger.sanMoi();
        System.out.println("---");

        Hippo hippo = new Hippo();
        System.out.println("con hà mã");
        hippo.picture();
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();
        hippo.animalType();
        hippo.living();
        System.out.println("---");

        Wolf wolf = new Wolf();
        System.out.println("con sói");
        wolf.picture();
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
        wolf.animalType();
        wolf.living();
        wolf.sanMoi();
        System.out.println("---");
    }
    
}
