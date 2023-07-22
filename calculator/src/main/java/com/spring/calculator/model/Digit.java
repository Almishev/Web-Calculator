package com.spring.calculator.model;

public class Digit {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int sumTotal(){
        return num1+num2;
    }

    public int minusTotal(){
        return num1-num2;
    }

    public int multiplicationTotal(){
        return num1*num2;
    }

    public double divideTotal(){
        if(num2==0){
          throw new ArithmeticException("error-zero");
        }
        return num1/num2;
    }
}
