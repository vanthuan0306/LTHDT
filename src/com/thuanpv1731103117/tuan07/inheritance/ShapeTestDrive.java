package com.thuanpv1731103117.tuan07.inheritance;


public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        Amoeba amoeba = new Amoeba();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        if(shape.nhapChuot=true){
            
            square.draw();
            square.rotate();
            square.playSound();
            System.out.println("---");

            circle.draw();
            circle.rotate();
            circle.playSound();
            System.out.println("---");

            triangle.draw();
            triangle.rotate();
            triangle.playSound();
            System.out.println("---");

            amoeba.rotate();
            amoeba.playSound();
            System.out.println("---hết---");


        } else 
        System.out.println("bạn chưa nhấp chuột");
        

    }
    
}
