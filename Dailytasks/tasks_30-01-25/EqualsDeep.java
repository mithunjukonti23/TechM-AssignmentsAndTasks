//equals and deepequals
package org.anurag;
import java.util.Arrays;
public class EqualsDeep {
	public static void main(String args[]) {
		int a1[]= {3,5,6,7,9};
		int a2[]= {3,5,6,7,9};
		Object[] ob1= {a1};
		Object[] ob2= {a2};
		if(Arrays.equals(a1, a2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		if(Arrays.deepEquals(ob1, ob2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
	}

}
