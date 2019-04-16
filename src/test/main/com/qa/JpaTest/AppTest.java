package com.qa.JpaTest;

import static org.junit.Assert.*;

import org.junit.*;

import com.qa.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@BeforeClass
	public static void freshData() {
		 Account acc1=new Account("bob","bob");
		 Account acc2=new Account("fred","fredo");
		 Account acc3=new Account("james","bobo");
		 
	}
  
	
	@Test
	public void test1() {
		System.out.println(Service.countName());
		assertEquals(0, Service.countName());
		
	}
	
}
