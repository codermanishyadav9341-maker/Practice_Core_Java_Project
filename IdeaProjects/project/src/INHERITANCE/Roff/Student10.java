package INHERITANCE.Roff;

 class Student10 {
     String name;

     Student10(String name){
         this.name = name;
     }

     public void display(){
         System.out.println("Student Name:- " +name);
     }
}

class MarkSheet extends Student10{
     double physics;
     double chemistry;
     double maths;

     MarkSheet(String name,double physics,double chemistry,double maths){
         super(name);
         this.physics = physics;
         this.chemistry = chemistry;
         this.maths = maths;
     }

     public void display(){

         double total_Marks = (physics+chemistry+maths);

         System.out.println("Student Name:- " +name);
         System.out.println("Physics Marks:- " +physics);
         System.out.println("Chemistry Marks:- " +chemistry);
         System.out.println("Maths Marks:- " +maths);
         System.out.println("Total Marks:- " +total_Marks);

     }

     public static void main(String[] args){

         MarkSheet so = new MarkSheet("Manish Yadav",75,50,80);
         so.display();
     }
}
