package com.qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
public class Service {
private static Map <String, Account> account = new HashMap<String, Account>();
public static void insertDetails() {
	Scanner sc = new Scanner(System.in);
	String firstName=sc.nextLine();
	String lastName=sc.nextLine();
	Account accounty=new Account(firstName, lastName);
	account.put(sc.nextLine(), accounty);
}
public static void retreiveAccount(Account accounty) {
	System.out.println(accounty.getFirstName());
	System.out.println(accounty.getLastName());
	System.out.println(accounty.getAccountNumber());
}
public static void getDetails(String kv) {
	Account accounty=account.get(kv);
	System.out.println(accounty.getFirstName());
	System.out.println(accounty.getLastName());
	System.out.println(accounty.getAccountNumber());
}
public static void getJson(String kv) {
	Account accounty=account.get(kv);
	Gson gson = new Gson(); 
	String json=gson.toJson(accounty);
	System.out.println(json);
}
public static String getAllJson() {
	Gson gson = new Gson(); 
	String json=gson.toJson(account);
	System.out.println(json);
	return json;
}
public static void jsonToMap(String json) {
   Map<String, Account> map= new HashMap<String, Account>();
   Gson gson = new Gson();
   map =(Map<String,Account>) gson.fromJson(json,map.getClass());
   System.out.println(gson.toJson(map));
}
}
