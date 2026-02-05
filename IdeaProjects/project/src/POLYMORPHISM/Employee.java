package POLYMORPHISM;

class Employee {
    int getBonus(int num) {
        return num;
    }
}

class Manager extends Employee{
    int getBonus(int num1){
        return num1;
    }
}

class Developer extends Employee{
    int getBonus(int num2){
        return num2;
    }

    public static void main(String[] args) {

        Employee em = new Employee();
        em.getBonus(1000);

        Manager m = new Manager();
        m.getBonus(3000);

        Developer d = new Developer();
        d.getBonus(2000);



        System.out.println("------------EMPLOYEE-BONUS--------");

        System.out.println("Employee Bonus:- " + em.getBonus(1000));
        System.out.println("Manager Bonus:- " + m.getBonus(3000));
        System.out.println("Developer Bonus:- " + d.getBonus(2000));



    }
}
