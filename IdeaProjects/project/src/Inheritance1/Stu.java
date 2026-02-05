package Inheritance1;

 class Stu {
     void display(String name){
         System.out.println("Student Name:- " +name);
     }
}

class MarkSheet extends Stu{
     void display(int physics_Marks,int chemistry_Marks,int Computer){
         int total_Marks = (physics_Marks + chemistry_Marks +Computer);
         System.out.println("Total marks:- " +total_Marks);
     }

    public static void main(String[] args) {

         MarkSheet marks = new MarkSheet();

         System.out.println("------Marks Sheet-------");
         marks.display("Manish");
         marks.display(90,90,90);
    }
}