import java.util.List;
class Emp{
    int id;
    String name;
    int salary;
    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
}
public class MethodRef {
    public static void main(String[] args) {
        List<String> names = List.of("Avinash","kartik","molika","chilika");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println("************Using Method Reference**********");
        names.forEach(System.out::println);

        List<Emp> emps = List.of(new Emp(101,"Avinash",45000),new Emp(102,"Kartik",35000),
                            new Emp(103,  "Akash",25000));
        emps.forEach(emp -> System.out.println(emp));
        System.out.println("************Using Method Reference**********");
        emps.forEach(System.out::println);
    }
}
