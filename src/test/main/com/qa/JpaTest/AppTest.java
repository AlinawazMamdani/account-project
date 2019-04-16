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
		 Service.account.put("a", acc1);
		 Service.account.put("b", acc1);
		 Service.account.put("c", acc1);
		 
	}
  
	
	@Test
	public void test1() {
		assertEquals(0, Service.countName("James"));
		
	}
	@Test
	public void test2() {
		assertEquals(1,Service.countName("bob"));
	}
}
