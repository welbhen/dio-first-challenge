package com.dio.digitalbank;

public abstract class Account implements IAcc {
	private static final int DEFAULT_AGENCY = 123;
	private static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
		
	public Account(Client client) {
		this.agency = DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}
	
	public int getAgency() {
		return agency;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	
	protected void printAccInfo() {
		System.out.println(String.format("Mr(s). %s", this.client.getName()));
		System.out.println(String.format("Ag: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: $ %.2f", this.balance));
	}
	
	@Override
	public void withdraw(double value) {
		this.balance = this.balance - value;
		
	}
	@Override
	public void deposit(double value) {
		this.balance = this.balance + value;
		
	}
	@Override
	public void transfer(double value, Account destination) {
		this.withdraw(value);
		destination.deposit(value);
		
	}	
	
}
