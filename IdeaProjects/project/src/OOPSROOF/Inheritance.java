package OOPSROOF;

//class Inheritance {
//
//}


// Questions no.1;

//class Animal{
//    public void makeSound(){
//        System.out.println("Animal has Different Sound");
//    }
//}
//
//class Dog extends Animal{
//    public void makeSound(){
//        System.out.println("Dogs barks");
//    }
//
//    public static void main(String[] args) {
//
//        Animal so = new Animal();
//        so.makeSound();
//
//        Dog d = new Dog();
//        d.makeSound();
//    }
//}


// Questions no.2;

//class Person{
//    public void showDetails(){
//        System.out.println("Person Details");
//    }
//}
//
//class Student extends Person{
//    public void showDetails(){
//        System.out.println("Student Details");
//    }
//
//    public static void main(String[] args){
//
//        Student so = new Student();
//        so.showDetails();
//
//
//    }
//}


//   Questions no. 3;

//class Shape{
//    int length;
//    int breath;
//
//    Shape(int length,int breath){
//        this.length = length;
//        this.breath = breath;
//    }
//
//    public void area(){
//        System.out.println("Calculating area.......");
//    }
//}
//
//class Rectangle extends Shape{
//    Rectangle(int length, int breath) {
//        super(length, breath);
//    }
//
//    public void area(){
//        int rectangle = (length * breath);
//        System.out.println("Area of rectangle:- " +rectangle);
//    }
//
//    public static void main(String[] args){
//
//        Rectangle ro = new Rectangle(10,20);
//        ro.area();
//    }
//}



//  class Shape{
//
//      int length;
//      int breath;
//
//      Shape(int length,int breath){
//          this.length = length;
//          this.breath = breath;
//      }
//      public void area(){
//          System.out.println("Calculating.......");
//      }
//  }
//
//  class Rectangle extends Shape{
//
//      Rectangle(int length,int breath){
//          super( length, breath);   //    Refer By Parent Class;
//      }
//
//      public void area(){
//          int rectangle = (length*breath);
//          System.out.println("Area of rectangle:- " +rectangle);
//      }
//
//      public static void main(String[] args) {
//          Rectangle ro = new Rectangle(10,20);
//
//          ro.area();
//
//      }
//  }



//     Questions no. 5;


//class Student{
//    String name;
//    double maths;
//    double science;
//    double computer;
//
//    Student(String name){
//        this.name= name;
//
//    }
//
//    public void display(){
//        System.out.println("Student Name:- " +name);
//    }
//}
//
//class MarkSheet extends Student{
//    int maths;
//    int science;
//    int computer;
//
//    MarkSheet(String name,int maths,int science,int computer){
//        super(name);
//        this.maths = maths;
//        this.science = science;
//        this.computer = computer;
//
//    }
//
//
//    public void display(){
//        int total_Marks = (maths+science+computer);
//        System.out.println("Total Marks:- " +total_Marks);
//    }
//
//    public static void main(String[] args) {
//
//        Student so = new Student("Manish Kumar");
//        so.display();
//
//        MarkSheet m = new MarkSheet("Manish kumar",50,90,70);
//        m.display();
//    }
//}
//
//




//   Questions no. 6;


//class Account{
//    double balance;
//
//    Account(double balance){
//        this.balance = balance;
//    }
//
//    public void showBalance(){
//        System.out.println("Bank balance:- " +balance);
//    }
//}
//
//class SavingAccount extends Account{
//    double interestRate;
//
//    SavingAccount(double balance,double interestRate){
//        super(balance);
//        this.interestRate = interestRate;
//    }
//
//    public void showBalance(){
//
//        double updateBalance = balance+(balance*interestRate/100);
//        System.out.println("Balance With Interest:- " +updateBalance);
//    }
//
//    public static void main(String[] args){
//
//        Account so = new Account(1000);
//        so.showBalance();
//
//        SavingAccount sa = new SavingAccount(1000,10);
//        sa.showBalance();
//    }
//}


//class LivingBeing{
//    public void Breathe(){
//        System.out.println("Breathing..........");
//    }
//}
//
//class Animal extends LivingBeing{
//    public void eat(){
//        System.out.println("Eating.......");
//    }
//}
//
//class dog extends Animal{
//    public void bark(){
//        System.out.println("Barking.........");
//    }
//
//    public static void main(String[] args){
//
//        dog d = new dog();
//        d.Breathe();
//        d.eat();
//        d.bark();
//    }
//}



//  Questions no. 8;

import java.util.concurrent.ExecutionException;

//class Course{
//    String courseName;
//
//    Course(String courseName){
//        this.courseName = courseName;
//    }
//
//    public void showCourse(){
//        System.out.println("Course Name:- " +courseName);
//    }
//}
//
//class EnrolledStudent extends Course{
//
//    String studentName;
//    int rollNo;
//
//    EnrolledStudent(String courseName,String studentName,int rollNo){
//        super(courseName);
//        this.studentName = studentName;
//        this.rollNo = rollNo;
//    }
//
//    public void showCourse(){
//        System.out.println("Course Name:- " +courseName);
//        System.out.println("Student Name:- " +studentName);
//        System.out.println("Roll No:- " +rollNo);
//    }
//
//    public static void main(String[] args){
//
//        EnrolledStudent so = new EnrolledStudent("Java Programming","Manish yadav",101);
//        so.showCourse();
//    }
//}



//   Questions no.9;

//class Employee{
//    String employeeName;
//
//    Employee(String employeeName){
//        this.employeeName = employeeName;
//    }
//
//    public void displayInfo(){
//        System.out.println("Employee Name:- " +employeeName);
//    }
//}
//
//class Manager extends Employee{
//    String department;
//
//    Manager(String employeeName, String department){
//        super(employeeName);
//        this.department = department;
//    }
//
//    public void displayInfo(){
//        System.out.println("Employee Name:- " +employeeName);
//        System.out.println("Departments:- " +department);
//    }
//
//    public static void main(String[] args) {
//
//        Manager m = new Manager("Karan","HR");
//        m.displayInfo();
//    }
//}


// Questions no. 10;


//class Shape{
//
//    public void Perimeters(){
//
//        System.out.println("Calculating perimeters............");
//
//    }
//}
//
//class Square extends Shape{
//    int sides;
//    Square(int sides){
//
//        this.sides = sides;
//
//
//    }
//
//    public void Perimeters(){
//        int Square = (4*sides);
//        System.out.println("Perimeters of Square:- " +Square);
//    }
//
//    public static void main(String[] args) {
//
//
//        Square so = new Square(10);
//        so.Perimeters();
//
//    }
//}


//    Questions no.11;

//class Animal{
//    public void eat(){
//        System.out.println("Animal is eating");
//    }
//}
//
//class cat extends Animal{
//    public void eat(){
//        System.out.println("Cat is eating");
//    }
//
//    public void sound(){
//        System.out.println("Cat meows");
//    }
//    public static void main(String[] args){
//
//        cat c = new cat();
//        c.eat();
//        c.sound();
//
//    }
//}



// Questions no. 12;

//class Book{
//    String title;
//    String author;
//
//    Book(String title,String author){
//        this.title = title;
//        this.author = author;
//    }
//
//    public void showDetails(){
//        System.out.println("Title:- " +title);
//        System.out.println("Author:- " +author);
//    }
//}
//
//class LibraryBook extends Book{
//    int shelfNumber;
//
//    LibraryBook(String title,String author,int shelfNumber){
//        super(title,author);
//        this.shelfNumber = shelfNumber;
//    }
//
//    public void showDetails(){
//        System.out.println("Title:- " +title);
//        System.out.println("Author:- " +author);
//        System.out.println("ShelfNumber:- " +shelfNumber);
//    }
//
//    public static void main(String[] args){
//
//        LibraryBook so = new LibraryBook("Java Basics","John Smith",5);
//        so.showDetails();
//    }
//}
//


//   Questions no 13;


class School{
    String schoolName;

    School(String SchoolName){
        this.schoolName = SchoolName;

    }

    public void showDetails(){
        System.out.println("School Name:- " +schoolName);
    }
}

class Teacher extends School{
    String teacherName;

    Teacher(String schoolName,String teacherName){
        super(schoolName);
        this.teacherName = teacherName;
    }

    public void showTeacherDetails(){
        System.out.println("Teacher Name:- " +teacherName);
    }

    public static void main(String[] args) {

        Teacher t = new Teacher("Vidya Niketan","Akash Sir");
        t.showDetails();
        t.showTeacherDetails();

    }
}