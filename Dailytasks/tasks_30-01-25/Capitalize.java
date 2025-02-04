//capitalizing every alternate element
package org.anurag;
import java.util.Scanner;
public class Capitalize {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(i%2==0)
			{
				c=Character.toUpperCase(c);
				sb.append(c);
			}
			else {
				c=Character.toLowerCase(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
