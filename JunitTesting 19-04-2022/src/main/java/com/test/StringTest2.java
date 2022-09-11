package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringTest2 {
	
	public static boolean checkString(String s) {
		String s1="London";
		if(s1.contains(s)) {
			return true;
		}
		return false;
	}
    @Test
    public void testString() {
    
    	//assertEquals(false,checkString("London99"));
       	assertEquals(true,checkString("London"));
    }
	
 }
