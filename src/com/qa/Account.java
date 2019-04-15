package com.qa;

public class Account {
private String firstName;
private String lastName;
private int accountNumber;
private static int newAccountNumber=0;

public Account(String firstName, String lastName) {
	this.accountNumber=newAccountNumber;
	newAccountNumber+=1;
	this.firstName=firstName;
	this.lastName=lastName;
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

}
