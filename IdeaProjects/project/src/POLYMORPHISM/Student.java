package POLYMORPHISM;

public class Student {

    void printDetails(String name,int age){
        System.out.println("Name:- " +name + "  \n Age:- " +age);
    }

     void printDetails(String name, int age, String course){

        System.out.println("Name:- " +name+ " \n Age:- " +age+ " \n Course:- " +course);
     }

    public static void main(String[] args) {
        Student s = new Student();
        s.printDetails("Manish" ,20);
        s.printDetails("Rahul",21,"B.Tech");
    }
}
