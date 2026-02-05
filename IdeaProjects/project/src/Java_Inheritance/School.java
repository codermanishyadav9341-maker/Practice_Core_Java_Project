package Java_Inheritance;

 class School {
     String schoolName;

     School(String schoolName){
         this.schoolName = schoolName;
     }

     public void schoolName(){
         System.out.println("School Name:- " +schoolName);
     }
}

class Teacher extends School{
     String name;

     Teacher(String schoolName, String name){
         super(schoolName);
         this.name = name;
     }

     public void teacherDetails(){
         System.out.println("Teacher Name:- " +name);
     }

     public static void main(String[] args){

         Teacher so = new Teacher("Vidya Niketan","Gaurav Kasyap");
         so.schoolName();
         so.teacherDetails();
     }
}
