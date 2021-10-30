package com.thuanpv1731103117.tuan08.tenlop;

public class Wolf extends Feline{
    public Wolf(){
        
    }

    @Override
    protected void eat() {
        System.out.println("Ăn kiểu Sói ");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Kêu tiếng Sói .. . hú");
    }
}
