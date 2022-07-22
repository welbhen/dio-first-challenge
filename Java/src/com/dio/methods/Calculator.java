package com.dio.methods;

public class Calculator {
    public static void sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
    public static void subtration(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }
    public static void mult(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + result);
    }
    public static void div(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
    
}
