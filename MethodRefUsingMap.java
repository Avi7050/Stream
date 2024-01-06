import java.util.List;
import java.util.stream.Collectors;

public class MethodRefUsingMap {
    public static List<Integer> stringToNumber(List<String> stringNumbers){
            return stringNumbers.stream()
                                        .map(Integer::valueOf)
                                        .collect(Collectors.toList());
        }
    public static void main(String[] args) {
        List<String> stringnumbers = List.of("1","2","3","4","5");
        List<Integer> numbers = MethodRefUsingMap.stringToNumber(stringnumbers);
        System.out.println(numbers);

    }
    
}
