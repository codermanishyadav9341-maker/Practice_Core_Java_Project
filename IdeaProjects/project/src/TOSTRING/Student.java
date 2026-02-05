package TOSTRING;

 public class Student {

          String name;
          int age;

          public Student(String name, int age) {
              this.name = name;
              this.age = age;
          }



          
          public String toString() {
              return "Student{name=" + name + ", age=" + age + "}";
          }


    public static void main(String[] args) {

        Student sp = new Student("Manish" , 20);

        System.out.println(sp);

    }
}
