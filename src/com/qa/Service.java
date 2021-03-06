package com.qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class Service {
	public Map<String, Account> account = new HashMap<String, Account>();

	public void insertDetails() {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		Account accounty = new Account(firstName, lastName);
		account.put(sc.nextLine(), accounty);
	}

	public void retreiveAccount(Account accounty) {
		System.out.println(accounty.getFirstName());
		System.out.println(accounty.getLastName());
		System.out.println(accounty.getAccountNumber());
	}

	public void getDetails(String kv) {
		Account accounty = account.get(kv);
		System.out.println(accounty.getFirstName());
		System.out.println(accounty.getLastName());
		System.out.println(accounty.getAccountNumber());
	}

	public void getJson(String kv) {
		Account accounty = account.get(kv);
		Gson gson = new Gson();
		String json = gson.toJson(accounty);
		System.out.println(json);
	}

	public String getAllJson() {
		Gson gson = new Gson();
		String json = gson.toJson(account);
		System.out.println(json);
		return json;
	}

	public void jsonToMap(String json) {
		Map<String, Account> map = new HashMap<String, Account>();
		Gson gson = new Gson();
		map = (Map<String, Account>) gson.fromJson(json, map.getClass());
		System.out.println(gson.toJson(map));
	}

	public int countName(String name) {
		// String json=getAllJson();
		int nameCount = 0;
		for (Account a : account.values()) {
			System.out.println(a.getFirstName());
			if (a.getFirstName() == name) {
				nameCount += 1;
			}
		}
		return nameCount;
	}

}
