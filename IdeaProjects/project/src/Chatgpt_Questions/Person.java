package Chatgpt_Questions;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
    }
}

class Student extends Person{
    int roll;

    Student(String name,int age,int roll){
        super(name,age);
        this.roll = roll;
    }

    public void showStudent(){
        System.out.println("Roll number:- " +roll);
    }

    public static void main(String[] args){
        Student ss = new Student("Manish Yadav",23,22056);
        ss.showPerson();
        ss.showStudent();
    }
}
