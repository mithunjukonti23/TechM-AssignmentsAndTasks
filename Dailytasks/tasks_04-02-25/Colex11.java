package collections;
import java.util.LinkedList;

public class Colex11 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);

        list.addLast(12);
        System.out.println(list);
    }
}
