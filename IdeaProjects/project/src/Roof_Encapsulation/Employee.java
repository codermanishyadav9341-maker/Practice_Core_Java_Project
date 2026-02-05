package Roof_Encapsulation;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private double bonus;

    Employee(String name,int employeeID,double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;

    }

    public void setBonus(double bonus){
        if(bonus >= 0){
           this. bonus = bonus;
        }
         else{
             System.out.println("Bonus Cannot be negative");
        }
    }

    public double getBonus(){
        return bonus;
    }
    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public double getSalary(){
        return salary;
    }

    public double getTotalPay(){
        return salary+(salary*bonus/100);
    }

    public void giveRaise(double percentage){
        if(percentage > 0){
            salary += salary *percentage/100;
        }
         else{
             System.out.println("Cannot negative");
        }
    }

    public static void main(String[] args){
        Employee ee = new Employee("Manish Yadav",104,500000);
        ee.setBonus(10);
        ee.giveRaise(0.5);

        System.out.println("--------------=:Employee Details:=---------------");
        System.out.println("Employee Name:- " +ee.getName());
        System.out.println("Employee ID:- " +ee.getEmployeeID());
        System.out.println("Salary:- " +ee.getSalary());
        System.out.println("Bonus:- " +ee.getBonus());
        System.out.println("Total Salary:- " +ee.getTotalPay());
    }
}
