package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StreamEx6 {
    public static void main(String[] args) {
    	List<String> ls=new ArrayList<>();
		ls.add("mithun");
		ls.add("mittu");
		ls.add("Jayanth");
		ls.add("karna");
        List<String> aorder = ls.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending Order is: " + aorder);
        List<String> dorder = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("descending Order is: " + dorder);
    }
}

