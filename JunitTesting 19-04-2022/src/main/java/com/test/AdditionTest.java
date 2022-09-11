package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {
	
	public static int add(int a, int b) {
		int add=a+b;
		return add;
	}
     @Test
     public void addTest() {
    	 assertEquals(8,AdditionTest.add(4, 4));
     }
}
