package Employee;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private double bonus;


    Employee(String name,int employeeID,double salary,double bonus){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.bonus = 0;
    }



    public void setBonus(double bonus){
        if(bonus >= 0){
            this.bonus = bonus;
        }
         else{
             System.out.println("Bonus Cannot be Negative");
        }
    }

    public String getName(){
        return name;
    }

    public double getEmployeeID(){
        return employeeID;
    }

    public double getSalary(){
        return salary;
    }

    public double getBonus(){
        return bonus;
    }

    public void giveRaise(double percentage){
        if(percentage >= 0){
            salary += salary * percentage/100;
        }
         else{
             System.out.println("Percentage Cannot be negative");
        }
    }

    public double getTotalPay(){
        return salary += salary *bonus/100;
    }

    public static void main(String[] args){

    }
}
