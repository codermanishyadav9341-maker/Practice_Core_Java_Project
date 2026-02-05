package Chatgpt_Questions;

public class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println("Employee Name:- " +name);
        System.out.println("Salary:- " +salary);
    }
}

class Manager extends Employee{
    String departments;

    Manager(String name,double salary,String departments){
        super(name,salary);
        this.departments = departments;
    }

    public void showDetails(){
        System.out.println("Manager Name:- " +name);
        System.out.println("Departments:- " +departments);
        System.out.println("Salary:- " +salary);
    }

    public static void main(String[] args){
        Manager mm = new Manager("Manish Yadav",50000,"Fresher");
        mm.showDetails();

    }
}
