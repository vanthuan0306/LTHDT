package com.thuanpv1731103117.tuan07;

public class IntSquare {
    private int squareValue;

    public IntSquare(){}

    public IntSquare ( int i){
        squareValue = i;
    }
    public int getSquare(){
        return calculateSquare();
    }
    private int calculateSquare(){
        //return squareValue * squareValue;
        return(int) Math.pow(squareValue,2);

    }

}
