package INHERITANCE.Roff;

 class Course {
     String courseName;

     Course(String courseName){
         this.courseName = courseName;
     }

     public void showCourse(){
         System.out.println("Course Name:- " +courseName);
     }
}

class EnrolledStudent extends Course{
     String StudentName;
     int rollNo;

     EnrolledStudent(String courseName,String StudentName,int rollNo){
         super(courseName);
         this.StudentName = StudentName;
         this.rollNo = rollNo;
     }

     public void showCourse(){
         System.out.println("Course Name:- " +courseName);
         System.out.println("Student Name:- " +StudentName);
         System.out.println("Roll Number:- " +rollNo);
     }

     public static void main(String[] args){
         EnrolledStudent so = new EnrolledStudent("Backend Developer","Manish Yadav",104);
         so.showCourse();
     }
}
