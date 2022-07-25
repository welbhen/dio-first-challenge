package com.dio.digitalbank;

public class CheckingAcc extends Account {
	public CheckingAcc(Client client) {
		super(client);
	}

	@Override
	public void showAcc() {
		System.out.println("=== Checking Account Status ===");
		super.printAccInfo();
	}
	
}
