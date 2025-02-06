package streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<>();
		ls.add("mithun");
		ls.add("mittu");
		ls.add("Jayanth");
		ls.add("karna");
		List<String> res=ls.stream().map(String::toUpperCase).collect(Collectors.toList()) ;
		System.out.println("Uppercase words are:"+res);
		List<String> res1=ls.stream().map(String::toLowerCase).collect(Collectors.toList()) ;
		System.out.println("Lowercase words are:"+res1);		
	}

}
