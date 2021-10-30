package com.thuanpv1731103117.tuan08.trenlop;

public class Hippo extends Animal {
    public Hippo(){
        
        System.out.println("Making a Hippo");
    }

    public Hippo(String n){
        super(n);
    }


    @Override
    protected void makeNoise() {

        if(hunger == 1){
            System.out.println("Kêu tiếng Hippo ...");
        }else if(hunger == 2){
            System.out.println("Kêu quạo ....");
        }
    }
}
