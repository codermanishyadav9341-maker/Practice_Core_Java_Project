package Inheritance1;

 class Person {
     void showDetails(){
         System.out.println("Person Details");
     }
}

class Student extends Person{
     void showDetails(){
         System.out.println("Student Details");
     }
     public static void main(String[] args){
         Student s = new Student();
         s.showDetails();
     }
}
