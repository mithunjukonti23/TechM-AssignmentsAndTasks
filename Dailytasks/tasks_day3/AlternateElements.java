//copying alternate elements from one array to the other
package org.anurag;
import java.util.Arrays;
import java.lang.System;
public class AlternateElements {
	public static void main(String args[])
	{
		int arr1[]= {1,2,3,4,5};
		int as;
		as=(arr1.length+1)/2;
		int arr2[]=new int[as];
		for(int i=0,j=0;i<arr1.length;i+=2,j++)
		{
			if(i<arr1.length)
			System.arraycopy(arr1, i, arr2, j, 1);
		}
		System.out.println(Arrays.toString(arr2));
		}
	}

