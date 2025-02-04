//reverse of a string
package assignments;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c;
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
