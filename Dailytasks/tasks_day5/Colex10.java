package collections;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Colex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<>();
number.add(10);
number.add(12);
number.add(16);
number.add(19);
number.add(14);
number.add(11);
Collections.shuffle(number);
	System.out.println(number);
	}

}


