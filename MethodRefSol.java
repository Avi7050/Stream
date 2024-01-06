import java.util.List;

public class MethodRefSol {
    public static void main(String[] args) {
        System.out.println("Using Lambda Expression filter the employee salary > 25000 and to them add 500 to everyone and the print the sum of total salaries: ");
        List<Employee> emps = List.of(new Employee(101, "avinash", 45000.90),
                                        new Employee(102, "akash", 35000.80),
                                        new Employee(103, "anjali", 20000.50),
                                        new Employee(104, "anu", 15000.45));
                    Double salary = emps.stream().filter(emp -> emp.salary > 25000).map(emp -> emp.salary + 500).reduce(((sal1,sal2) -> sal1+sal2)).get();
                    System.out.println(salary);
        System.out.println("Using method Reference filter the employee salary > 25000 and to them add 500 to everyone and the print the sum of total salaries: ");
                    Double salaries = emps.stream().filter(Employee::checkSalary).map(Employee::increaseSal).reduce(Double::sum).get();
                    System.out.println(salaries);
        
    }
}
