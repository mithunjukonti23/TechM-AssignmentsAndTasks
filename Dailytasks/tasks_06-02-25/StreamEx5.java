package streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<>();
		ls.add("mithun");
		ls.add("mittu");
		ls.add("Jayanth");
		ls.add("karna");
		char sc='m';
		long count=ls.stream().filter(s->s.startsWith(String.valueOf(sc))).count() ;
		System.out.println("The count of words starting with "+sc+" is "+count);		
	}

}

