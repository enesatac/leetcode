package com.cosmorbit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSum1Test {

    TwoSum1 ts = new TwoSum1();

    @Test
	public void test1() {
		int[] input = { 2, 7, 11, 15 };
		int[] output = { 0, 1 };
		assertArrayEquals(output, ts.twoSum(input, 9));
	}


    @Test
    public void test2() {
        int[] input = { 3, 2, 4 };
		int[] output = { 1, 2 };
		assertArrayEquals(output, ts.twoSum(input, 6));
    }
    
}
