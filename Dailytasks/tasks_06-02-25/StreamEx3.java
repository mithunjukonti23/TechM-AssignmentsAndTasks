package streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(23);
		ls.add(37);
		int osum=ls.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		int esum=ls.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Odd sum is : "+osum);
		System.out.println("Even sum is : "+esum);
	}
}
		