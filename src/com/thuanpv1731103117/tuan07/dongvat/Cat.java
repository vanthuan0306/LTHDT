package com.thuanpv1731103117.tuan07.dongvat;

public class Cat extends Animal{

    @Override
    protected void picture() {
        img = "cat.img";
        // TODO Auto-generated method stub
        super.picture();
    }

    @Override
    protected void makeNoise() {
        sound = "meo meo";
        // TODO Auto-generated method stub
        super.makeNoise();
    }



    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        food="thức ăn thừa, chuột";
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
        live = "Sống cùng con người";
        super.living();
    }

    void batChuot(){
        System.out.println("Bắt chuột cắn phá đồ đạt.");
    }
    
}
