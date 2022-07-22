package com.dio.methods;

public class Main {
    public static void main(String[] args) {
        //Calculator:
        System.out.println("1 - Calculator exercise:");
        Calculator.sum(3, 6);
        Calculator.subtration(9, 1.5);
        Calculator.mult(7, 8);
        Calculator.div(5, 2.5);
        
        System.out.println("");
        
        //Message:
        System.out.println("2 - Message exercise:");
        Message.message(9);
        Message.message(14);
        Message.message(1);

        System.out.println("");
        
        //Loan:
        System.out.println("3 - Loan exercise:");
        Loan.calculate(1000, Loan.getTwoPayments());
        Loan.calculate(1000, Loan.getThreePayments());
        Loan.calculate(1000, 5);
    }
}
