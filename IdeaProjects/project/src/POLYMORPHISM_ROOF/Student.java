package POLYMORPHISM_ROOF;

public class Student {

    public void PrintDetails(String name,int age){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
    }

    public void PrintDetails(String name,int age,String course){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Student so = new Student();
        so.PrintDetails("Manish Yadav",23);
        so.PrintDetails("Ronit Raj",23,"BCA");

    }
}
