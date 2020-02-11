package com.kodilla.kodillacourse;

public class Calculator {

    public double addAToB(double a, double b){
        return a + b;
    }
    public double subtractBFromA(double a, double b){
        return a - b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        double ad = calculator.addAToB(10,7);
        double sub = calculator.subtractBFromA(10,7);
        System.out.println(ad + "\n" + sub);
    }
}
