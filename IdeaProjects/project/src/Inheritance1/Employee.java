package Inheritance1;

 class Employee {
     void displayInfo(String name){
         System.out.println("Employee Name:- " +name);
     }
}

class Manager extends Employee{
     void displayInfo(String department){
         System.out.println("Departments:- " +department);
     }

     public static void main(String[] args){

         Manager so = new Manager();
         Employee e = new Employee();
         e.displayInfo("Karan");
         so.displayInfo("HR");
     }
}
