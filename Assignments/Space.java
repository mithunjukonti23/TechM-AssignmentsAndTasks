//space character count
package assignments;
import java.util.Scanner;
public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char c;
		int sc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			
			c=s.charAt(i);
			if(c==' ')
			{
				sc+=1;
			}
			else
			{
				cc+=1;
			}
		}
		System.out.println("No of spaces : "+sc+" and characters : "+cc);

	}

}
