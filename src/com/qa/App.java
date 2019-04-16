package com.qa;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {

public static void main (String[] args ) {
	Scanner sc = new Scanner(System.in);
	boolean finished= false;
	while (finished==false) {
		System.out.println("press '1' for add account Press '2' for get account Press '3' to get info as a json press 'f' to finish" );
		switch (sc.nextLine()){
		case "1":
			Service.insertDetails();
			continue;
		case "2":
			System.out.println("enter the key value for the account");
			Service.getDetails(sc.nextLine());
			continue;
		case "3":
		System.out.println("enter the key value for the account");
		Service.getJson(sc.nextLine());
		continue;
		case "f":
			System.out.println("thanks for using this program");
		    finished = true;
		}
		}
	}


}
