package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	App a = new App();

	public static boolean compare(int[] array, int[] array2){
		if(array.length != array2.length){
			return false;
		}
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] != array2[i]){
				return false;
			}
		}
		return true;
	}
	public void test1(){
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		int x = 5;
		int y = 25;

		int[] expected = {90,240,450,720};
		assertTrue("Test1 Successful!",compare(a.calc(array1,array2,x,y),expected));
	}

	public void test2(){
		int[] array1 = {5,25,86,98};
		int[] array2 = {33,46,16,62};
		int x = 15;
		int y = 35;

		int[] expected = {8250,57500,68800,303800};
		assertTrue("Test2 Successful!",compare(a.calc(array1,array2,x,y),expected));
	}

	public void test3(){
		int[] array1 = {9,7,77,43};
		int[] array2 = {17,29,16,82};
		int x = 14;
		int y = 99;

		int[] expected = {17289,22939,139216,398438};
		assertTrue("Test3 Successful!",compare(a.calc(array1,array2,x,y),expected));
	}

	public void test4(){
		int[] array1 = {46,79,147,173};
		int[] array2 = {87,99,106,89};
		int x = 94;
		int y = 105;

		int[] expected = {796398,1556379,3100818,3064003};
		assertTrue("Test4 Successful!",compare(a.calc(array1,array2,x,y),expected));
	}

	public void test5(){
		int[] array1 = {146,179,1147,1173};
		int[] array2 = {487,399,2106,189};
		int x = 694;
		int y = 7105;

		int[] expected = {554524498,557012379,1659254834,1729014903};
		assertTrue("Test5 Successful!",compare(a.calc(array1,array2,x,y),expected));
	}
}
