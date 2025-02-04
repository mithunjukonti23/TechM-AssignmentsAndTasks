package generic;
import java.util.List;
import java.util.Arrays;
public class GenericF {
	public static <T> int findFirstOccurrence(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(findFirstOccurrence(words, "banana"));
    }
}

