package Java_Inheritance;

 class Employee {
     String name;

     Employee(String name){
         this.name = name;
     }

     public void displayInfo(){
         System.out.println("Employee Name:- " +name);
     }

}

class Manager extends Employee{
     String departments;

     Manager(String name,String departments){
         super(name);
         this.departments = departments;
     }

     public void displayInfo(){
         System.out.println("Employee Name:- " +name);
         System.out.println("Departments:- " +departments);

     }
     public static void main(String[] args){

         Manager so = new Manager("Manish Yadav","HR");
         so.displayInfo();
     }
}
