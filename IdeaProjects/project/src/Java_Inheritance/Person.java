package Java_Inheritance;

 class Person {
     public void ShowDetails(){
         System.out.println("Student Details");
     }
}

class Student extends Person{
     public void ShowDetails(){
         System.out.println("Student Details");
     }
     public static void main(String[] args){
         Student so = new Student();
         so.ShowDetails();
     }
}
