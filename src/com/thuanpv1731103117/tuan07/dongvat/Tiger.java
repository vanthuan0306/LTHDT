package com.thuanpv1731103117.tuan07.dongvat;

public class Tiger extends Animal {
    @Override
    protected void picture() {
        img = "tiger.img";
        // TODO Auto-generated method stub
        super.picture();
    }

    @Override
    protected void makeNoise() {
        // TODO Auto-generated method stub
        sound = "Gruuuu";
        super.makeNoise();
    }
    
    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        food = "Thịt động vật tươi sống";
        super.eat();
    }

    @Override
    protected void sleep() {
        // TODO Auto-generated method stub
        timeSleep = "Ngủ đông";
        super.sleep();
    }

    @Override
    protected void roam() {
        // TODO Auto-generated method stub
        move = "Đi lại trong rừng";
        super.roam();
    }

    @Override
    protected void animalType() {
        // TODO Auto-generated method stub
        type = "Động vật ăn thịt";
        super.animalType();
    }

    @Override
    protected void living() {
        // TODO Auto-generated method stub
        live = "Rừng sâu";
        super.living();
    }

    void sanMoi(){
        System.out.println("Săn bắt đông vật hoang dã.");
    }
}
