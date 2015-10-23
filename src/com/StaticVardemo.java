package com;

class Account {
	private int accountId;
	private int customerId;
	private Double balance;
	public Account(int customerId,Double balance) {
		this.customerId=customerId;
		this.balance=balance;
		this.accountId=IDGenerator.id;
		IDGenerator.id++;
		
	}
	public  Double getBalance() {
		return balance;
	}
	public  void setBalance(Double balance) {
		this.balance = balance;
	}
	public  int getCustomerId() {
		return customerId;
	}
	public  void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public  int getAccountId() {
		return accountId;
	}
	public  void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
}
class IDGenerator{
	public static int id=1;
}
public class StaticVardemo{
	public static void main(String[] args) {

		Account ac1=new Account(234, (double)40000);
		Account ac2=new Account(1232, (double)56000);
		Account ac3=new Account(501,(double) 12000);
		System.out.println(ac1.getAccountId()+" "+ac2.getAccountId()+" "+ac3.getAccountId());
	}
	
}
