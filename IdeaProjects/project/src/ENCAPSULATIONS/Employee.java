package ENCAPSULATIONS;

 class Employee {

//      Using Private Keywords;

     private String name;
     private int employeeld;
     private double salary;
     private double bonus;

//     Using Constructors;

     public Employee(String name,int employeeld,double salary){
         this.name = name;
         this .employeeld = employeeld;
         this.salary = salary;
     }

//      Using getter methods used;

     public String getName(){
         return name;
     }

     public int getEmployeeld(){
         return employeeld;
     }

     public double getSalary(){
         return salary;
     }

     public double getBonus(){
         return bonus;
     }

//      Using Setter method;

     public void setBonus(double bonus){
         if(bonus > 0){
             this.bonus = bonus;
         }
         else{
             System.out.println("Bonus Cannot be Negative");
         }
     }

     public double getTotalPay(){

         return salary+bonus;
     }

     public void giveRise(double percentage){
         if(percentage > 0){
             salary += salary*(percentage/100);
         }
     }

     public String getEmployeeDetails(){
         return "Employee Name:- " +name+
                 "\nEmployee Id:- " +employeeld+
                 "\nSalary:- " +salary+
                 "\nBonus:- " +bonus+
                 "\nTotalPay:- " +getTotalPay();
     }

     public static void main(String[] args){

         Employee so = new Employee("Manish kumar",101,1000);

         so.getSalary();
         so.setBonus(50);
         so.giveRise(2);
         so.getEmployeeDetails();

        System.out.println("----------Employee Salary----------");
        System.out.println("Employee Details");
        System.out.println( so.getEmployeeDetails());



     }
}
