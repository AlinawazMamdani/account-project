package com.qa;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service serv = new Service();
		boolean finished = false;
		while (finished == false) {
			System.out.println(
					"press '1' for add account Press '2' for get account Press '3' to get info as a json press 'f' to finish press '4' to get all map as json");
			switch (sc.nextLine()) {
			case "1":
				serv.insertDetails();
				continue;
			case "2":
				System.out.println("enter the key value for the account");
				serv.getDetails(sc.nextLine());
				continue;
			case "3":
				System.out.println("enter the key value for the account");
				serv.getJson(sc.nextLine());
				continue;
			case "4":
				serv.getAllJson();
			case "5":
				String json = serv.getAllJson();
				serv.jsonToMap(json);
				continue;
			case "f":
				System.out.println("thanks for using this program");
				finished = true;
			}
		}
	}

}
