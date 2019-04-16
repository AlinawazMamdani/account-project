package com.qa.JpaTest;

import static org.junit.Assert.*;

import org.junit.*;

import com.qa.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
	Service serv=new Service();
	@Before
	public void freshData() {
		
		 Account acc1=new Account("bob","bob");
		 Account acc2=new Account("fred","fredo");
		 Account acc3=new Account("James","bobo");
		 serv.account.put("a", acc1);
		 serv.account.put("b", acc2);
		 serv.account.put("c", acc3);
		 
	}
  
	
	@Test
	public void test1() {
		assertEquals(1, serv.countName("James"));
	
	}
	@Test
	public void test2() {
		assertEquals(1,serv.countName("bob"));
	}
}
