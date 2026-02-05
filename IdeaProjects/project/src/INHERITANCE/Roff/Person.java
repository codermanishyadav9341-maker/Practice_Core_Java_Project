package INHERITANCE.Roff;

 class Person {
     public void showDetails(){
         System.out.println("Person Details");
     }
}
class Student extends Person{
     public void showDetails(){
         System.out.println("Student Details");
     }

     public static void main(String[] args){
         Student so = new Student();
         so.showDetails();
     }
}
