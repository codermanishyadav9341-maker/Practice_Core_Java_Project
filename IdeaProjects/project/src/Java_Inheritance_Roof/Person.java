package Java_Inheritance_Roof;

 class Person {

     public void showDetails(){
         System.out.println("Person Details");
     }
}

class Student1 extends Person{

     public void showDetails(){
         System.out.println("Student Details");
     }

     public static void main(String[] args){
         Student1 ss = new Student1();
         ss.showDetails();

     }
}
