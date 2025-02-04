//vowels and consonants count
package assignments;
import java.util.Scanner;
public class vccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		scan.close();
		s=s.toLowerCase();
		char c;
		int vc=0,cc=0;
		String v="aeiou";
		String co="bcdfghjklmnpqrstvwxyz";
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			for(int j=0;j<v.length();j++)
			{
				if(c==v.charAt(j))
				{
					vc+=1;
				}
				
			}
			for(int k=0;k<co.length();k++)
			{
				if(c==co.charAt(k))
				{
					cc+=1;
				}
			}
		}
		System.out.println("vowel count -"+vc);
		System.out.println("consonant count -"+cc);

	}

}
