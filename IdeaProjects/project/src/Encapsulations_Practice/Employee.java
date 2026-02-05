package Encapsulations_Practice;

 class Employee {
     private String name;
     private int employee;
     private double salary;
     private double bonus;


//      Constructors;

     Employee(String name,int employee,double salary){
         this.name = name;
         this.employee = employee;
         this.salary = salary;
     }

     public String getName(){
         return name;
     }

     public int getEmployee(){
         return employee;
     }

     public double getSalary(){
         return salary;
     }

     public double getBonus(){
         return bonus;
     }


     public void setBonus(double bonus){
         if(bonus >= 0){
             this.bonus = bonus;

         }
          else{
              System.out.println("Bonus is not negative");
         }
     }

     public double getTotalPay(){
         double total = salary+bonus;
         return total;
     }


     public void giveRaise(double percentage){
         if(percentage > 0){
             salary += salary *(percentage/100);



         }
     }

     public String getEmployeeDetails(){
         return "Employee Name:- " +name+
                 "\nNumber of Employee:- " +employee+
                 "\nSalary:- " +salary+
                 "\nBonus:- " +bonus+
                 "\nTotal Pay:- " +getTotalPay();
     }

     public static void main(String[] args){

         Employee so = new Employee("Manish Yadav",10,50000);
         so.giveRaise(10);
         so.setBonus(500);


         System.out.println("-----------------:Employee Details:-----------------");
         System.out.println(so.getEmployeeDetails());
     }
}
