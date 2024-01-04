import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = List.of("Avinash","kartik","molika","chilika");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println("************Using Method Reference**********");
        names.forEach(System.out::println);
    }
}
