import java.util.*;

public class MapEmployee {
    public static void main(String[] args) {
        System.out.println("Only filtering the names::");
        List<Employee> emps = Arrays.asList(new Employee(101, "Avinash", 50000.00), new Employee(102, "Abhishek", 40000.00),
                new Employee(103, "Akash", 30000.00));
        emps.stream().map(emp -> emp.getName() + " Sinha").forEach(emp -> System.out.println(emp));
        System.out.println("Filtering and printing all objects::");
        emps.stream().filter(emp -> emp.getSalary() > 30000).map(emp -> {
            emp.setSalary(emp.getSalary() + 5000);
            return emp;
        }).forEach(emp -> System.out.println(emp));
    }
}
