package INHERITANCE.Roff;

 class College {
     String collegeName;

     College(String collegeName){
         this.collegeName = collegeName;
     }
}

class Admission extends College{
     String StudentName;
     String course;

     Admission(String collegeName,String StudentName,String course){
         super(collegeName);
         this.StudentName = StudentName;
         this.course = course;
     }

     public void display(){
         System.out.println("College Name:- " +collegeName);
         System.out.println("Student Name:- " +StudentName);
         System.out.println("Course:- " +course);
     }

     public static void main(String[] args){
         Admission so = new Admission("Brabu University","Manish Yadav","BCA");
         so.display();

     }
}
