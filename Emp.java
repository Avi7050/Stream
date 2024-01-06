public class Emp {
    String name;
    int age;
    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int newAge(){
        return this.age + 2;
    }
}
