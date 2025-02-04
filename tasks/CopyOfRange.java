//Arrays copyOfRange
package org.anurag;
import java.util.Arrays;
public class CopyOfRange {
	public  static void main(String args[]) {
		int a1[]= {1,3,4,8,29};
		int a2[]=new int[6];
		a2=Arrays.copyOfRange(a1,0,4);
		System.out.print("arr2="+Arrays.toString(a2));
		}
	}
