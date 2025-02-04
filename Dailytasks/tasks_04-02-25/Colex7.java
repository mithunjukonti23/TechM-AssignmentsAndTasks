package collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Colex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		List<Integer> number=new ArrayList<>();
number.add(10);
number.add(12);
number.add(16);
number.add(19);
number.add(14);
number.add(11);
int n=scan.nextInt();
if(number.contains(n)) {
	System.out.println("found the number");
}
else {
	System.out.println("number not found");
}
	}

}

