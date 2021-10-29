package com.thuanpv1731103117.tuan07.inheritance;



public class Amoeba extends Shape {
    // String music = "Amoeba.HIF";
    // boolean click = false;
    int x;
    int y;

    Amoeba(){}
    public Amoeba(String s){
        //sound = s;
    }

    public Amoeba(String s, int xx, int yy){
        x = xx;
        y = yy;
    }
    
    public void rotate(){
        System.out.println("Xoay theo tọa độ x: "+x+ " và y: "+y);
    }

    public void playSound(){
        System.out.println("Phát âm thanh " +getAmThanh());
    }

}
