import java.util.List;
import java.util.stream.Collectors;

public class MethodRefUsingConverter {
    public static List<Integer> stringToNumber(List<String> stringNumber) {
        return stringNumber.stream().map(Integer::valueOf).collect(Collectors.toList());
    }

    public static List<Integer> stringLength(List<String> names) {
        return names.stream().map(String::length).collect(Collectors.toList());
    }

    public static List<String> stringUpperCase(List<String> names){
        return names.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Converting the given the number in string format to Integer format: ");
        List<String> stringNumber = List.of("1", "2", "3", "4", "5");
        List<Integer> numbers = MethodRefUsingConverter.stringToNumber(stringNumber);
        System.out.println(numbers);
        System.out.println("Print the length of all the strings using method reference: ");
        List<String> names = List.of("avinash", "akash", "anamika", "arbind");
        List<Integer> length = MethodRefUsingConverter.stringLength(names);
        System.out.println(length);
        System.out.println("Print the given string in Upper Case Character: ");
        List<String> upperCase = MethodRefUsingConverter.stringUpperCase(names);
        System.out.println(upperCase);
    }
}
