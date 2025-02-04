package collections;
import java.util.LinkedList;

public class Colex15 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        System.out.println(list);
        list.add(1, 50);

        for (int num : list) {
            System.out.println(num);
        }
    }
}

