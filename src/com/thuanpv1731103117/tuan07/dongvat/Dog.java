package com.thuanpv1731103117.tuan07.dongvat;

public class Dog extends Animal{
    @Override
    protected void picture() {
        img = "dog.img";
        // TODO Auto-generated method stub
        super.picture();
    }

    @Override
    protected void makeNoise() {
        sound = "gâu gâu";
        // TODO Auto-generated method stub
        super.makeNoise();
    }



    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        food="thức ăn thừa";
        super.eat();
    }

    @Override
    protected void sleep() {
        // TODO Auto-generated method stub
        timeSleep = "ban đêm";
        super.sleep();

    }

    @Override
    protected void roam() {
        // TODO Auto-generated method stub
        move = "Đi lang thang quanh nhà";
        super.roam();
    }

    @Override
    protected void animalType() {
        // TODO Auto-generated method stub
        type = "Thú cưng";
        super.animalType();
    }

    @Override
    protected void living() {
        // TODO Auto-generated method stub
        live = "Cùng con người";
        super.living();
    }

    void function(){
        System.out.println("Giữ nhà");
    }




    
}
