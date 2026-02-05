package PLOYMORPHISM_PRACTICE;

class Employee {
    double getBonus(){
        return 1000;
    }
}

class Manager extends Employee{
    double getBonus(){
        return 3000;
    }
}

class Developer extends Employee{
    double getBonus(){
        return 2000;
    }

    public static void main(String[] args){

        Developer d = new Developer();
        d.getBonus();

        Manager m = new Manager();
        m.getBonus();

        Employee e = new Employee();
        e.getBonus();


        System.out.println("---------------BONUS DISTRIBUTIONS-----------");
        System.out.println("Employee Bonus:- " +d.getBonus());
        System.out.println("Managers Bonus:- " +m.getBonus());
        System.out.println("Employee Bonus:- " +e.getBonus());


    }
}
