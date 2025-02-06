package streams;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.util.ArrayList;
public class StreamEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(23);
		ls.add(37);
		int max = ls.stream().max(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
        System.out.println("maximum Value is: " + max);
        int min = ls.stream().min(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
        System.out.println("minimum Value is : " + min);

	}

}
