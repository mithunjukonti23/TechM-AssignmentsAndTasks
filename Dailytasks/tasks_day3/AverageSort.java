//sorting the average of students
package org.anurag;
import java.util.Scanner;
import java.util.Arrays;
public class AverageSort {
	public static void main(String args[]) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no of students :");
		n=scan.nextInt();
		int mr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int m1=0,m2=0,m3=0;
			int avg;
			int j=i+1;
			System.out.print("Enter the name of student "+j+": ");
			String name=scan.next();
			System.out.print("Enter the marks of student "+j+":");
			m1=scan.nextInt();
			m2=scan.nextInt();
			m3=scan.nextInt();
			avg=(m1+m2+m3)/3;
			mr[i]=avg;
			j++;
		}
		Arrays.sort(mr);
		System.out.println(Arrays.toString(mr));
		scan.close();
		}
}
