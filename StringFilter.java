import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> names = List.of("avinash","akash","neeraj","himanshu","vishal","kartik");

        System.out.println("Name starts with 'a': ");
        names.stream().filter(name -> name.startsWith("a")).forEach(name -> System.out.print(name+ ", "));

        System.out.println("\nName starts with 'a' && length > 5 ");
        names.stream().filter(name -> name.startsWith("a") && name.length() > 5).forEach(name -> System.out.print(name+ " "));

        System.out.println("\nCollect Name starts with 'a' as List");
        List<String> collectNames = names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
        System.out.println(collectNames);

        System.out.println("\nCollect Name starts with 'a' as Set");
        Set<String> collectNamesSet = names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toSet());
        System.out.println(collectNamesSet);

        System.out.println("\nCount all Names");
        long count = names.stream().count();
        System.out.println("No of names:" + count);

        System.out.println("\nFind first Name starts with 'a'");
        String firstName = names.stream().filter(name -> name.startsWith("a")).findFirst().get();
        System.out.println("First Name: " + firstName);

        System.out.println("\nFind 3rd Name");
        String thirdName = names.stream().skip(2).findFirst().get();
        System.out.println("Third Name: " + thirdName);

    }
}
