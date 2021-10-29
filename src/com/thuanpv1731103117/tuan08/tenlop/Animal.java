package com.thuanpv1731103117.tuan08.tenlop;

public class Animal {
    protected String sound;
    protected String img;
    protected String food;
    protected String timeSleep;
    protected String move;
    protected String live;
    protected String type;


    protected void picture(){
        System.out.println("Hình ảnh của con vật: "+img);
    }

    protected void makeNoise(){
        System.out.println("Âm thanh phát ra của con vật là: " +sound);

    }
    

    protected void eat(){
        System.out.println("Thức ăn của con vật là: " +food);

    }

    protected void sleep(){
        System.out.println("Thời gian ngủ của con vật là: " +timeSleep);
    }

    protected void roam(){
        System.out.println("Phương thức đi lại: "+move);
    }

    protected void animalType(){
        System.out.println("Loại động vật: "+type);
    }
    
    protected void living(){
        System.out.println("Nơi sống: "+live);
    }
}
