//last character in a word
package assignments;
import java.util.Scanner;
public class Lastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char c;
		char r;
		char l;
		for(int i=0;i<s.length();i++)
		{		
			c=s.charAt(i);
			if(c==' '||i==s.length()-1)
			{
				r=s.charAt(i-1);
				if(!Character.isDigit(r))
				{
					if(r!=' '&&i!=s.length()-1) 
					{
						System.out.print(r);
					}
				if(i==s.length()-1) {
					l=s.charAt(i);
					if(l!=' ')
					{
						System.out.print(s.charAt(i));
					}
				}
					
				}
			}
				
			
		}
		

	}

}
