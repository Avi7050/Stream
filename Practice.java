import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee(12, "Avinash", 45000.59),
                new Employee(11, "Neeraj", 25000.56),
                new Employee(13, "Vishal", 55000.95),
                new Employee(10, "Himanshu", 35000.45));
        System.out.println("According to id:");
        emps.sort((emp1, emp2) -> emp1.id.compareTo(emp2.id));
        System.out.println(emps);
        System.out.println("According to names:");
        emps.sort((emp1, emp2) -> emp1.name.compareTo(emp2.name));
        System.out.println(emps);
        System.out.println("According to salary:");
        emps.sort((emp1, emp2) -> emp1.salary.compareTo(emp2.salary));
        System.out.println(emps);

        System.out.println("Using stream to sort in decending order According to salary:");
        emps.stream().sorted((emp1, emp2) -> emp2.salary.compareTo(emp1.salary))
                .forEach(emp -> System.out.println(emp));

        System.out.println("Using stream to sort in decending order According to salary < 50000:");
        List<Employee> empList = emps.stream().filter(emp -> emp.salary < 50000)
                .sorted((emp1, emp2) -> emp2.salary.compareTo(emp1.salary)).collect(Collectors.toList());
        System.out.println(empList);

    }
}
