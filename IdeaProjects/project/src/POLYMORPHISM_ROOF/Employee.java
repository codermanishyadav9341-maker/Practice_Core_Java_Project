package POLYMORPHISM_ROOF;

public class Employee {

    public int getBonus(){
        return 1000;
    }
}

class Manager extends Employee{
    public int getBonus(){
        return 3000;
    }
}

class Developer extends Employee{
    public int getBonus(){
        return 2000;
    }

    public static void main(String[] args){
        Employee ee = new Employee();
        ee.getBonus();
        System.out.println("Employee Bonus:- " +ee.getBonus());

        Employee mm = new Manager();
        System.out.println("Manager Bonus:- " +mm.getBonus());

        Employee bb = new Developer();
        bb.getBonus();
        System.out.println("Developer Bonus:- " +bb.getBonus());

    }
}
