package Practice;

class Employee {
    String name;
    int salary;

    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public void Work(){
        System.out.println("Teaching.........");
        System.out.println("Employee Name:- " +name);
        System.out.println("Salary:- " +salary);
    }
}


class Managers extends Employee{

    int teamSize;
    Managers(String name,int salary,int teamSize){
        super(name,salary);
        this.teamSize = teamSize;
    }

    public void ConductMeeting(String meetingName){
        System.out.println("Meeting Name:- " +meetingName);
        System.out.println("Manager Name:- " +name);
        System.out.println("Salary:- " +10000);
        System.out.println("TeamSize:- " +teamSize);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name,int salary,String programmingLanguage){
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void SoftwareDeveloper(){
        System.out.println("Developer Name:- " +name);
        System.out.println("Salary:- " +salary);
        System.out.println("ProgrammingLanguage:- " +programmingLanguage);

    }

    public static void main(String[] args) {
        Developer so = new Developer("Manish Kumar",50000,"Java");
        so.SoftwareDeveloper();

        System.out.println("------------------------------------------------------------------------------------");

        Managers mo = new Managers("Gaurav Kasyap",50000,200);
        mo.ConductMeeting("Coding Age");

        System.out.println("------------------------------------------------------------------------------------");

        Employee eo = new Employee("Ankit Kumar",20000);
        eo.Work();


    }
}