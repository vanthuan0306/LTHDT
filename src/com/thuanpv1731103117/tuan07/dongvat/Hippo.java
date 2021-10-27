package com.thuanpv1731103117.tuan07.dongvat;

public class Hippo extends Animal{
    @Override
    protected void picture() {
        img = "hippo.img";
        // TODO Auto-generated method stub
        super.picture();
    }

    @Override
    protected void makeNoise() {
        // TODO Auto-generated method stub
        sound = "...";
        super.makeNoise();
    }
    
    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        food = "cỏ, thảm thực vật";
        super.eat();
    }

    @Override
    protected void sleep() {
        // TODO Auto-generated method stub
        timeSleep = "Ngủ vào ban đêm";
        super.sleep();
    }

    @Override
    protected void roam() {
        // TODO Auto-generated method stub
        move = "ven suối trong rừng";
        super.roam();
    }

    @Override
    protected void animalType() {
        // TODO Auto-generated method stub
        type = "Động vật ăn cỏ";
        super.animalType();
    }

    @Override
    protected void living() {
        // TODO Auto-generated method stub
        live = "Rừng sâu";
        super.living();
    }

       
}
