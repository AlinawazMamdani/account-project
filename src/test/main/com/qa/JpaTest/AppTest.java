package com.qa.JpaTest;

import static org.junit.Assert.*;

import org.junit.*;

import com.qa.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
	@Test
	public static void test1() {
		assertEquals(0, Service.countName());
		
	}
	
}
