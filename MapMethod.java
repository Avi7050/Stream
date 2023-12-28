import java.util.*;
        // map() method 
public class MapMethod {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,30,40,50,60);
        marks.stream().map(mark -> mark + 5).forEach(mark -> System.out.print(mark + " "));
        System.out.println();
        List<String> names = Arrays.asList("Aviansh","neeraj","himanshu");
        names.stream().map(name -> name + "soft").forEach(name -> System.out.print(name + " ")); 
     }
}
