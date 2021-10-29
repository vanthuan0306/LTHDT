package com.thuanpv1731103117.tuan08.tenlop;

public class Employee extends Person {
    protected int salary;
    public String toString(){
        String s;
        s= name + ", " + birthday;
        s += ", " + salary;
        return s;

    }
}
