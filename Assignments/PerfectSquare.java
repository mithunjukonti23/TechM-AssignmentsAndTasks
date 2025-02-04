//perfect square or not
package assignments;
import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double res=Math.sqrt(n);
		if(res==Math.floor(res))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
