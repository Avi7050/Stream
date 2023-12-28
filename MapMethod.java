import java.util.*;
        // map() method 
public class MapMethod {
    public static void main(String[] args) {
        System.out.println("adding some values to the number::");
        List<Integer> marks = Arrays.asList(20,30,40,50,60);
        marks.stream().map(mark -> mark + 5).forEach(mark -> System.out.print(mark + " "));
        System.out.println("\nAdding \"Soft\" at the end of every name::");
        List<String> names = Arrays.asList("Aviansh","neeraj","himanshu");
        names.stream().map(name -> name + "soft").forEach(name -> System.out.print(name + " ")); 
        System.out.println("\nfiltering the number as even number and then multiplying it by 10::");
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        numbers.stream().filter(i -> i % 2 == 0).map(i -> i * 10).forEach(i -> System.out.print(i + " "));
     }
}
