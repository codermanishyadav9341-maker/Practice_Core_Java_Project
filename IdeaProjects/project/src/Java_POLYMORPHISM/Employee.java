package Java_POLYMORPHISM;

 class Employee {
     int getBonus(){
         return 1000;
     }
}

class Manager extends Employee{
     int getBonus(){
         return 3000;
     }
}

class Developer extends Employee{
     int getBonus(){
         return 2000;
     }

     public static void main(String[] args){
         Employee em = new Employee();
         em.getBonus();

         Manager ma = new Manager();
         ma.getBonus();

         Developer db = new Developer();
         db.getBonus();

         System.out.println("Employee Bonus:- " +em.getBonus());
         System.out.println("Manager Bonus:- " +ma.getBonus());
         System.out.println("Developer Bonus:- " +db.getBonus());

     }
}

