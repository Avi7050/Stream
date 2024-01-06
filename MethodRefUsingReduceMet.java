import java.util.List;
import java.util.function.Predicate;

public class MethodRefUsingReduceMet {
    public static void main(String[] args) {
        System.out.println("Using lambda Expression reduce() method: ");
        List<Integer> ages = List.of(22,24,26,28);
        int age = ages.stream().reduce((age1,age2) -> age1 + age2).get();
        System.out.println(age);
        System.out.println("Using method refernce: ");
        ages.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println("print total String except the empty String: ");
        List<String> names = List.of("","avinash","","resham","uma","","appu");
        String name = names.stream().filter(Predicate.not(String::isEmpty)).reduce(String::concat).get();
        System.out.println(name);
    }
}
