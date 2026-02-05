package Inheritance1;

 class College {
     void college(String college_Name){
         System.out.println("College Name:- " +college_Name);
     }
}

class Admission extends College{
     void admission(String student_Name,String course){
         System.out.println("Student Name:- " +student_Name+ "\n Course:- " +course);
     }

     public static void main(String[] args){

         Admission so = new Admission();
         so.college("R P S College Mahnar");
         so.admission("Manish Yadav" , "BCA");
     }
}
