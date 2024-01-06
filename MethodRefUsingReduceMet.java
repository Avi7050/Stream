import java.util.List;

public class MethodRefUsingReduceMet {
    public static void main(String[] args) {
        System.out.println("Using lambda Expression reduce() method: ");
        List<Integer> ages = List.of(22,24,26,28);
        int age = ages.stream().reduce((age1,age2) -> age1 + age2).get();
        System.out.println(age);
        System.out.println("Using method refernce: ");
        ages.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
