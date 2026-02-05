package INHERITANCEQuestions;

 class Person {
    void showDetails(){
        System.out.println("Person Details");
    }
}
class Student extends Person{
     void ShowDetails(){
         System.out.print("Student Details");
     }
     public static void main(String[] args){

         Student so = new Student();

         so.ShowDetails();

     }
}

