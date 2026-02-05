package INHERITANCE.Roff;

 class School {
     String schoolName;

     School(String schoolName){
         this.schoolName = schoolName;
     }

     public void showSchool(){
         System.out.println("School Name:- " +schoolName);
     }
}

class Teacher extends School{
     String teacherName;

     Teacher(String schoolName,String teacherName){
         super(schoolName);
         this.teacherName = teacherName;
     }

     public void showTeacherDetails(){
         System.out.println("Teacher Name:- " +teacherName);
     }

     public static void main(String[] args){

         Teacher tt = new Teacher("Green Valley","Gurav");
         tt.showSchool();
         tt.showTeacherDetails();
     }
}
