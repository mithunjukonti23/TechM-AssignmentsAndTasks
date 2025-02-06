package streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(23);
		ls.add(37);
		double avg=ls.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Average is : "+avg);
	}

}
