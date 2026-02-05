package INHERITANCEQuestions;

//import java.util.Scanner;
//
//    class Student {
//     String name;
//
//     Student(String name) {
//         this.name = name;
//     }
//
//
//     void  display(){
//         System.out.println("Name:- " +name);
//     }
//}
//
//      class MarkSheet extends Student {
//
//     void student(){
//         Scanner scan = new Scanner(System.in);
//
//         System.out.print("Enter your Physics Marks:- ");
//         int marks1 = scan.nextInt();
//
//         System.out.print("Enter your Maths Marks:- ");
//         int marks2 = scan.nextInt();
//
//         System.out.print("Enter your Third Marks:- ");
//         int marks3 = scan.nextInt();
//
//         int total_marks = (marks1 +marks2 +marks3);
//
//         System.out.print("Total__Marks:- " +total_marks);
//     }
//
//     public static void main(String[] args){
//
//         MarkSheet so = new MarkSheet();
//
//         so.display();
//         so.student();
//     }
//  }


// Questions no. 6;

//class Account{
//    double balance;
//
//    Account(double balance){
//        this.balance = balance;
//    }
//
//    public void showBalance(){
//        System.out.println("Account Balance:- " +balance);
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
//        double updateBalance = balance +(balance * interestRate);
//        System.out.println("Balance With balance:- " +updateBalance);
//    }
//
//    public static void main(String[] args) {
//
//        Account so = new Account(1000);
//        so.showBalance();
//
//        SavingAccount sa = new SavingAccount(1000,5);
//        sa.showBalance();
//    }
//}



//   Questions no 7;


//class  Course{
//    String courseName;
//
//    Course(String courseName){
//        this.courseName = courseName;
//    }
//
//    public void showCourse(){
//        System.out.println("Course Name:- " +courseName);
//    }
//
//}
//
//class EnrolledStudent extends Course{
//    String StudentName;
//    int rollNumber;
//
//    EnrolledStudent(String courseName,String StudentName,int rollNumber){
//        super(courseName);
//        this.StudentName = StudentName;
//        this.rollNumber = rollNumber;
//    }
//
//    public void showCourse(){
//
//        System.out.println("Course Name:- " +courseName);
//        System.out.println("Student Name:- " +StudentName);
//        System.out.println("Roll No:- " +rollNumber);
//    }
//
//    public static void main(String[] args) {
//
//        EnrolledStudent so = new EnrolledStudent("Backend Developer","Manish Kuamr",101);
//        so.showCourse();
//    }
//
//}





// Questions no. 9;




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
//class Managers extends Employee{
//    String departments;
//
//    Managers(String employeeName,String departments){
//        super(employeeName);
//        this.departments = departments;
//
//    }
//
//    public void displayInfo(){
//        System.out.println("Employee Name:- " +employeeName);
//        System.out.println("Departments:- " +departments);
//    }
//
//    public static void main(String[] args) {
//
//        Managers  so = new Managers("Manish Kumar","HR");
//        so.displayInfo();
//    }
//}



//   Questions no . 10;

//class Shape{
//
//    public void Perimeters(){
//        System.out.println("Calculating areas............");
//    }
//}
//
//class Square extends Shape{
//    int sides;
//
//    Square(int sides){
//        this.sides = sides;
//    }
//
//    public void Perimeters(){
//        int square = (4 * sides);
//        System.out.println("Perimeters of Squares:- " +square);
//    }
//
//    public static void main(String[] args) {
//
//        Square so = new Square(10);
//        so.Perimeters();
//    }
//}



//  Questions no. 11;

//class Eat{
//
//    public void eat(){
//        System.out.println("Animal is eating");
//    }
//}
//
//class cat extends Eat{
//
//    public void eat(){
//        System.out.println("cat is eating");
//
//    }
//
//    public void Sound(){
//        System.out.println("Cat meows");
//    }
//
//    public static void main(String[] args) {
//
//        cat so = new cat();
//        so.eat();
//        so.Sound();
//    }
//}


//   Questions no. 12;


//class Book{
//    String title;
//    String author;
//
//    Book(String title,String author){
//        this.title = title;
//        this.author = author;
//    }
//
//    public void ShowDetails(){
//        System.out.println("Title:- " +title);
//        System.out.println("Authors:- " +author);
//    }
//}
//
//class LibraryBook extends Book{
//
//    int shiftNumber;
//
//    LibraryBook(String titles,String author,int ShiftNumber){
//        super("titles","author");
//        this.shiftNumber = ShiftNumber;
//    }
//
//    public void ShowDetails(){
//        System.out.println("Titles:- " +title);
//        System.out.println("Authors:- " +author);
//        System.out.println("Shift Number:- " +shiftNumber);
//    }
//
//    public static void main(String[] args){
//
//        LibraryBook so = new LibraryBook("Java Basics","Jhon Smith",5);
//        so.ShowDetails();
//    }
//}





//   Questions no. 13;


//class School{
//    String SchoolName;
//
//    School(String SchoolName){
//        this.SchoolName = SchoolName;
//    }
//
//    public void showSchool(){
//        System.out.println("School Name:- " +SchoolName);
//    }
//}
//
//class Teacher extends School{
//    String teacherName;
//
//    Teacher(String teacherName,String SchoolName){
//        super(SchoolName);
//        this.teacherName = teacherName;
//
//    }
//
//    public void TeacherDetails(){
//        System.out.println("Teacher name:- " +teacherName);
//    }
//    public static void main(String[] args){
//
//        Teacher so = new Teacher("Gaurav Kasyap","Coding Age");
//
//        so.showSchool();
//        so.TeacherDetails();
//    }
//}



//   Questions no. 14;


//class BankAccount{
//    double balance;
//
//    BankAccount(double balance){
//        this.balance = balance;
//    }
//
//    public void displayBalance(){
//        System.out.println("Initial Balance:- " +balance);
//    }
//}
//
//class SavingAccount extends BankAccount{
//
//    SavingAccount(double balance){
//        super(balance);
//    }
//
//    public void deposit(double amount){
//        balance = balance + amount;
//
//        System.out.println("Deposited Balance:- " +amount);
//        System.out.println("New Balance:- " +balance);
//    }
//
//    public static void main(String[] args) {
//
//        SavingAccount so = new SavingAccount(5000);
//
//        so.displayBalance();
//        so.deposit(1000);
//    }
//}


//    Questions no. 15;



//class Device{
//    String deviceName;
//
//    Device(String deviceName){
//        this.deviceName = deviceName;
//    }
//
//    public void ShowInfo(){
//        System.out.println("Device Name:- " +deviceName);
//    }
//}
//
//class Mobile extends Device{
//    String Operating_System;
//
//    Mobile(String deviceName, String Operating_System){
//        super(deviceName);
//        this.Operating_System = Operating_System;
//    }
//
//
//    public void ShowInfo(){
//        System.out.println("Device Name:- " +deviceName);
//        System.out.println("Operating System:- " +Operating_System);
//    }
//
//    public static void main(String[] args){
//
//        Mobile so = new Mobile("SAMSUNG GALAXY","Android");
//        so.ShowInfo();
//    }
//}



//    Questions no. 16;


//class Train{
//    public void run(){
//        System.out.println("Train is Running");
//    }
//}
//
//class Metro extends Train{
//    public void run(){
//        System.out.println("Metro is Running on electric track");
//    }
//
//    public static void main(String[] args){
//
//        Metro so = new Metro();
//        so.run();
//    }
//}


//  Questions no. 17;


//class Food{
//    String FoodName;
//
//    Food(String FoodName){
//        this.FoodName = FoodName;
//    }
//
//    public void display(){
//        System.out.println("Food Name:- " +FoodName);
//    }
//}
//
//class Desert extends Food{
//    String SweetLevel;
//
//    Desert(String FoodName, String SweetLevel){
//        super(FoodName);
//        this.SweetLevel = SweetLevel;
//    }
//
//    public void display(){
//        System.out.println("Food Name:- " +FoodName);
//        System.out.println("Sweetness Level:- " +SweetLevel);
//    }
//
//    public static void main(String[] args){
//
//        Desert so = new Desert("Gulab Jamun","High");
//        so.display();
//    }
//}



//    Questions no. 18;

class College{
    String CollegeName;

    College(String CollegeName){
        this.CollegeName = CollegeName;
    }
}

class Admission extends College{
    String StudentName;
    String Course;

    Admission(String CollegeName, String StudentName, String Course){
        super(CollegeName);
        this.StudentName = StudentName;
        this.Course = Course;
    }

    public void display(){
        System.out.println("College Name:- " +CollegeName);
        System.out.println("Student Name:- " +StudentName);
        System.out.println("Course:- " +Course);
    }

    public static void main(String[] args){

        Admission so = new Admission("Coding Age","Manish Yadav","BCA");
        so.display();
    }
}