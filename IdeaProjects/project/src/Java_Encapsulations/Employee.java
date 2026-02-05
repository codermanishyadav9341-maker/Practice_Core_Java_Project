package Java_Encapsulations;

 class Employee {
     private String name;
     private int employee;
     private double salary;
     private double bonus;

//      Using Constructor
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
              System.out.println("Bonus Cannot Negative");
         }
     }

     public double getTotalPay(){
         double totalPay = (salary + bonus);
         return totalPay;
     }

     public void giveRise(double percentage){

         if(percentage > 0){
             salary += salary*(percentage/100);
         }
          else{
              System.out.println("Raise percentage must be Positive");
         }
     }

     public String getEmployeeDetails(){
         return "Employee Name:- " +name+
                 "\nEmployee ID:- " +employee+
                 "\nSalary:- " +salary+
                 "\nBonus:- " +bonus;
     }

     public static void main(String[] args){
         Employee em = new Employee("Manish Yadav",104,50000);
         em.setBonus(500);
         em.giveRise(10);
         em.getEmployeeDetails();

         System.out.println(em.getEmployeeDetails());
     }
}
