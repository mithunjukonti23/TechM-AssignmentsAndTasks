package collections;

import java.util.LinkedList;
import java.util.Iterator;

public class Colex14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        Iterator<Integer> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
