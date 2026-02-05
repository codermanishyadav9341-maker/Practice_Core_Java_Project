package Java_Inheritance;

 class Student1 {
     String name;

     Student1(String name){
         this.name = name;
     }

     public void display(){
         System.out.println("Student name:- " +name);
     }
}

class MarkSheet extends Student1{
     double english;
     double maths;
     double hindi;

     MarkSheet(String name,double english,double maths,double hindi){
         super(name);
         this.english = english;
         this.maths = maths;
         this.hindi = hindi;
     }

     public void display(){

         double total = (english+maths+hindi);

         System.out.println("------------------:Mark Sheet:---------------");
         System.out.println("Student name:- " +name);
         System.out.println("English Marks:- " +english);
         System.out.println("Maths Marks:- " +maths);
         System.out.println("Hindi Marks:- " +hindi);
         System.out.println("Total Marks:- " +total);


     }

     public static void main(String[] args){

         MarkSheet so = new MarkSheet("Manish Yadav",85,96,75);
         so.display();
     }
}
