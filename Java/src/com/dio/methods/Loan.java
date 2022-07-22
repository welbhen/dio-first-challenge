package com.dio.methods;

public class Loan {
	
	public static int getTwoPayments() {
		return 2;
	}
	
	public static int getThreePayments() {
		return 3;
	}
	
	public static double getTaxTwoPayments() {
		return 0.3;
	}
	
	public static double getTaxThreePayments() {
		return 0.45;
	}
	
	public static void calculate(double value, int payments) {
		if(payments == 2) {
			double finalValue = value + (value * getTaxTwoPayments());
			System.out.println("Your loan's final value for 2 payments is: $ " + finalValue);
		}else if(payments == 3) {
			double finalValue = value + (value * getTaxThreePayments());
			System.out.println("Your loan's final value for 3 payments is: $ " + finalValue);
		}else {
			System.out.println("Payment not accepted!");
		}
	}

}
