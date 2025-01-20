package com.modelingClasses;

public class Calculator {
    //Attribute
    double result;

    //Method Get and Set
    public double GetResult(){
        return this.result;
    }
    public void SetResult(double result){
        this.result = result;
    }

    //Functions - Math Operations
    public double Add(double number1, double number2){
        result = number1 + number2;
        return result;
    }
    public double Subtract(double number1, double number2){
        result = number1 - number2;
        return result;
    }
    public double Multiply(double number1, double number2){
        result = number1 * number2;
        return result;
    }
    public double Divide(double number1, double number2){
        if (number2==0)
            { result =0;}
        else
            {result = number1 - number2;}

        return result;
    }
}
