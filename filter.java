import java.util.*;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Printing the filtered data");
        // numbers.stream().filter(i -> i % 2 == 0).forEach(number ->
        // System.out.print(number + " "));
        System.out.println("collect the filted data in list format");
        List<Integer> evenlist = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenlist);
        System.out.println("collect the filted data in set format");
        Set<Integer> oddset = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toSet());
        System.out.println(oddset);
        System.out.println("count no of elements");
        long count = numbers.stream().count();
        System.out.println("No of Elementds: " + count);
        System.out.println("First element");
        int num = numbers.stream().filter(i -> i % 2 == 0).findFirst().get();
        System.out.println("first num: " + num);
        System.out.println("Specific element");
        int specific = numbers.stream().filter(i -> i % 2 == 0).skip(2).findFirst().get();
        System.out.println("Specific num: " + specific);

    }
}
