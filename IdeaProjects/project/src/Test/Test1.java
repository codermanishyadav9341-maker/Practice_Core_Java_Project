package Test;

// class Test1 {
//
//     String name;
//     int age;
//     int rollNo;
//
//     Test1(String name,int age,int rollNo){
//         this.name = name;
//         this.age = age;
//         this.rollNo = rollNo;
//     }
//
//     public void displayInfo(){
//         System.out.println("Name:- " +name);
//         System.out.println("Roll No:- " +rollNo);
//         System.out.println("Age:- " +age);
//     }
//
//     public static void main(String[] args){
//
//         Test1 so = new Test1("Rohit",101,10);
//         so.displayInfo();
//
//
//     }
//}




//class Employee{
//
//    String name;
//    double salary;
//
//
//    Employee(String name,double salary){
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public double calculateBonus(double percentage){
//        return salary+(salary*percentage);
//    }
//
//    public static void main(String[] args){
//
//        Employee so = new Employee("Anshal",50000);
//        so.calculateBonus(10);
//
//        System.out.println("Salary for Anshal:- " +so.calculateBonus(10));
//    }
//
//}


//class BankAccount{
//    double accountNo;
//    double balance;
//
//
//    BankAccount(double accountNo,double balance){
//        this.accountNo = accountNo;
//        this.balance = balance;
//    }
//
//
//
//    public void deposit(double amount){
//        balance += amount;
//        System.out.println("Deposit:- " +amount);
//        System.out.println("Balance:- " +balance);
//    }
//
//    public void withdraw(double amount){
//        balance -= amount;
//        System.out.println("Withdraw:- " +amount);
//    }
//
//    public void updateBalance(){
//        System.out.println("Update Balance:- " +balance);
//    }
//
//    public static void main(String[] args){
//
//        BankAccount so = new BankAccount(934196754,10000);
//        so.deposit(40000);
//        so.withdraw(5000);
//        so.updateBalance();
//
//    }
//}


//class Rectangle{
//    double length;
//    double breath;
//
//    Rectangle(double length,double breath){
//        this.length = length;
//        this.breath = breath;
//    }
//
//    public void calculateArea(){
//        double area = (length * breath);
//        System.out.println("Area of rectangle:- " +area);
//    }
//
//    public void calculatePerimeters(){
//        double perimeters = 2*(length + breath);
//        System.out.println("Perimeters of rectangle:- " +perimeters);
//    }
//
//    public static void main(String[] args){
//
//        Rectangle so = new Rectangle(10,20);
//        so.calculateArea();
//        so.calculatePerimeters();
//    }
//}


//class Book{
//    String title;
//    String author;
//    double price;
//
//    Book(String title,String author,double price){
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    public void displayInfo(){
//        System.out.println("Title:- " +title);
//        System.out.println("Authors:- " +author);
//        System.out.println("Price:- " +price);
//    }
//
//    public static void main(String[] args){
//
//        Book so = new Book("Java Basics","Gaurav",450);
//        so.displayInfo();
//    }
//}


//class Radius{
//    double radius;
//
//    Radius(double radius){
//        this.radius = radius;
//    }
//
//    public void calculateArea(){
//        double  area = 3.14*radius*radius;
//        System.out.println("Area of Circles:- " +area);
//    }
//
//    public static void main(String[] args){
//
//        Radius so = new Radius(7);
//        so.calculateArea();
//    }
//}


//class Student{
//    String name;
//    double marks;
//
//
//    Student(String name,double marks){
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public String getMarks(){
//        if(marks >= 90) return "A";
//        else if(marks >= 75) return "B";
//        else if(marks >= 60) return "C";
//        else return "f";
//    }
//
//    public static void main(String[] args){
//
//        Student so = new Student("Kriti",82);
//        so.getMarks();
//
//        System.out.println("---------Report Card------------");
//       System.out.println("Student Name:- " +so.getName());
//       System.out.println("Grade:- " +so.getMarks());
//    }
//}


import java.util.ArrayList;
import java.util.Scanner;

class Array{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.println("Array Elements:- " +list);

        int maxElements = list.get(0);

        for(int i = 0; i<size; i++){
            if(list.get(i) > maxElements){
              maxElements = list.get(i);
            }
        }

        System.out.println("Maximum Elements:- " +maxElements);

    }
}