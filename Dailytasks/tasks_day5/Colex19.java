package collections;
import java.util.LinkedList;
public class Colex19 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        System.out.println(list);
        list.add(2, 04);
        System.out.println("After inserting at index 2: " + list);
    }
}
