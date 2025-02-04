package generic;

import java.util.*;

public class Genericex1 {

    // Task 1: Check if two arrays are equal
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Task 2: Sum of even and odd numbers
    public static int sumEven(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }
    
    public static int sumOdd(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
    }

    // Task 3: Find index of first occurrence
    public static <T> int findFirstOccurrence(List<T> list, T target) {
        return list.indexOf(target);
    }

    // Task 4: Reverse a list
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    // Task 5: Merge two lists alternately
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            if (i < list1.size()) merged.add(list1.get(i));
            if (i < list2.size()) merged.add(list2.get(i));
        }
        return merged;
    }

    public static void main(String[] args) {
        // Task 1 Test
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println(areArraysEqual(arr1, arr2)); // true

        // Task 2 Test
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Even Sum: " + sumEven(numbers));
        System.out.println("Odd Sum: " + sumOdd(numbers));

        // Task 3 Test
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(findFirstOccurrence(words, "banana")); // 1

        // Task 4 Test
        System.out.println(reverseList(words));

        // Task 5 Test
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        System.out.println(mergeLists(list1, list2));
    }
}
