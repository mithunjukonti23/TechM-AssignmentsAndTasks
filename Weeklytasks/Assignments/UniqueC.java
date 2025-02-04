//unique character
package assignments;
import java.util.Scanner;
public class UniqueC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		char c;	
		boolean d=false;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			for(int j=0;j<sb.length();j++) {
			if(c==sb.charAt(j))
			{
				d=true;
				break;
			}
			}
			if(!d)
			{
				sb.append(c);
			}
			d=false;
			
		}
		System.out.println(sb);

	}

}
