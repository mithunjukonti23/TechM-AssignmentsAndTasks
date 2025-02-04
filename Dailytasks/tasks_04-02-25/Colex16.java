package collections;
import java.util.LinkedList;

public class Colex16 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        System.out.println(list);
        list.addFirst(100);  
        list.addLast(200);   
        System.out.println("After adding at first & last :" + list);
    }
}

