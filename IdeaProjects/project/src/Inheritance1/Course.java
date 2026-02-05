package Inheritance1;

 class Course {
     void displayInfo(String course_Name){
         System.out.println("Course Name:- "  +course_Name);
     }
}

class EnrolledStudent extends Course{
     void showCourse(String studentName,int rollNumber){
         System.out.println("Student Name:- " +studentName+ "\n Roll Number:- " +rollNumber);
     }

     public static void main(String[] args){

         EnrolledStudent so = new EnrolledStudent();
         so.displayInfo("Coding ");
         so.showCourse("Manish",10);

     }
}
