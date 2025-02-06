package streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(23);
		ls.add(37);
		ls.add(23);
		ls.add(37);
		ls.add(10);
		List<Integer> dis=ls.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct numbers are : "+dis);
	}
}
		
