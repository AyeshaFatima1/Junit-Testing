package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinNumTest {
	
	public static int checkMin(int arr[]) {
		int min=8;
		for(int num:arr) {
			if(min>num)
				min=num;
		}
		System.out.println(min);
		return min;
	}
     @Test
     public void testMin() {
    	 assertEquals(2,MinNumTest.checkMin(new int[] {2,4,5,8}));
     }
}
