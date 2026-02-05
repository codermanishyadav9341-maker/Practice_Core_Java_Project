package Java_Inheritance;

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
     String name;
     int rollNo;

     EnrolledStudent(String courseName,String name,int rollNo){
         super(courseName);
         this.name = name;
         this.rollNo = rollNo;
     }

     public void showCourse(){
         System.out.println("Course Name:- " +courseName);
         System.out.println("Student Name:- " +name);
         System.out.println("Roll No:- " +rollNo);

     }
     public static void main(String[] args){
         EnrolledStudent so = new EnrolledStudent("Java Programming","Manish Yadav",101);
         so.showCourse();
     }
}
