package com.dio.digitalbank;

public class SavingAcc extends Account {
	public SavingAcc(Client client) {
		super(client);
	}

	@Override
	public void showAcc() {
		System.out.println("=== Saving Account Status ===");
		super.printAccInfo();
	}
}
