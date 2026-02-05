package TOSTRING;

 class Person {
     String name;
      int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println(p);

    }
}