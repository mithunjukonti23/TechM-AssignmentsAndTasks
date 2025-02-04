package collections;
import java.util.List;
import java.util.ArrayList;
public class Colex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<>();
number.add(10);
number.add(12);
number.add(16);
number.add(19);
number.add(14);
number.add(11);
System.out.println(number);
System.out.println("After inserting an element at first poition :");
number.add(0,9);
System.out.println(number);
	}

}
