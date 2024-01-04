import java.util.List;
import java.util.stream.Collectors;

class Emp {
    int id;
    String name;
    double salary;
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public boolean salaryCheck() {
        return this.salary > 20000;
    }
    public boolean nameCheck() {
        return this.name.startsWith("A");
    }
}

public class MethodRefUsingObject {
    public static void main(String[] args) {
        List<Emp> emps = List.of(new Emp(101, "Aviansh", 45000.50),
                new Emp(102, "Akash", 35000.50),
                new Emp(103, "Bipasha", 25000.50),
                new Emp(104, "Sonakshi", 15000.50),
                new Emp(105, "Abhilasa", 55000.50));
        System.out.println("Filter Employee object whose salary is greater than 20000: ");
        List<Emp> empList = emps.stream().filter(emp -> emp.salary > 20000).collect(Collectors.toList());
        System.out.println(empList);
        System.out.println("\nUsing method Reference, Filter Employee object whose salary is greater than 20000: ");
        emps.stream().filter(Emp::salaryCheck).forEach(System.out::print);
        System.out.println("\nUsing method Reference, Filter Employee object whose name starts with \"A\": ");
        List<Emp> nameList = emps.stream().filter(Emp::nameCheck).collect(Collectors.toList());
        System.out.println(nameList);

    }
}
