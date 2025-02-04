package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Colex17 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(37);
        list.add(12);
        System.out.println(list);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        list.addFirst(n);
        System.out.println("After adding at front: " + list);
    }
}
