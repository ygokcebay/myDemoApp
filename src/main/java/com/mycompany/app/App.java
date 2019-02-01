package com.mycompany.app;

public class App 
{
    public static int[] calc( int[] array, int[] array2, int x, int y )
    {
	   int len = array.length;
	   int[] result = new int[len];
        for(int i = 0 ; i < array.length ; i++){
		result[i] = array[i] * array2[i] * (x+y);
	   }

	   return result;
    }
}
