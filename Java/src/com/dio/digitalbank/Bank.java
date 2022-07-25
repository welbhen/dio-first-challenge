package com.dio.digitalbank;

import java.util.List;

public class Bank {
	private String name;
	private List<Account> clients;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getClients() {
		return clients;
	}
	public void setClients(List<Account> clients) {
		this.clients = clients;
	}

}
