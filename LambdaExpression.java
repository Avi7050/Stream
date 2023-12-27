import java.util.Map;

class LambdaExpression{
    public static void main(String[] args) {
        Map<Integer, Emp> emps = Map.of(1,new Emp("Avinash", 27), 2,new Emp("Kartik", 28));
        emps.forEach((k,v) -> System.out.println("key: "+ k+", "+"value: name "+v.name+", age: "+v.age) );
    }
}