package collections;
import java.util.LinkedList;

public class Colex20 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        list.add(23);  
        list.add(45);
        System.out.println(list);
        int n = 23;
        int fo= list.indexOf(n);
        int lo = list.lastIndexOf(n);
        System.out.println("First Occurrence of " + n+ ": "+fo);
        System.out.println("Last Occurrence of " + n + ": " + lo);
    }
}

