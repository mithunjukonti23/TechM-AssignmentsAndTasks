//character at odd position
package assignments;

import java.util.Scanner;
public class Oddchar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0) {			
				System.out.print(s.charAt(i));
			}			
		}	
	}
}

