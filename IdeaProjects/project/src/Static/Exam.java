package Static;

 class Exam {

     static int a = 100;      //  Static variable;

     static void display(String name){       // Static Methods;
         System.out.println("Name:- " +name);
     }

     static{   // Static Block;
         System.out.println("1st Block");
     }

     public static void main(String[] args){

         Exam.display("Manish");
         System.out.println("Value of a is:- " +a);



     }
}
