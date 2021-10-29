package com.thuanpv1731103117.tuan07.inheritance;

import java.util.ArrayList;
import java.util.List;

import com.thuanpv1731103117.tuan07.dongvat.Animal;
import com.thuanpv1731103117.tuan07.dongvat.Dog;
public class ArrayListDemoProgram {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>();

        list.add("Tùng");
        list.add("Tí");
        list.add("Tèo");

        System.out.println(list);


        ArrayList<String> list5;
        list5 = new ArrayList<>();
        list5.add("Mai");
        list5.add("Đào");
        System.out.println("Số phần tử của list5 là: " +list5.size());
        System.out.println(list5);

        List<Shape> list2 = new ArrayList<>();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Amoeba amoeba = new Amoeba();

        list2.add(circle);
        list2.add(square);
        list2.add(triangle);
        list2.add(amoeba);
        
        //cách 1
        for (Shape shape : list2){
            shape.playSound();
            shape.rotate();
        }

        //cách 2
        // for(int i = 0; i < list2.size(); i ++){

        //     Shape shape = list2.get(i);
        //     shape.playSound();
        //     shape.rotate();

        // }

        List<Animal> list3;

        List<Dog> list4;
    }
    

    
}
