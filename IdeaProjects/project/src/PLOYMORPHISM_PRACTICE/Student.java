package PLOYMORPHISM_PRACTICE;

//class Student {
//
//    public void PrintDetails(String name,int age) {
//        System.out.println("Student Name:- " + name);
//        System.out.println("Age:- " + age);
//
//    }
//
//    public void PrintDetails(String name,int age,String course){
//        System.out.println("Student Name:- " +name);
//        System.out.println("Age:- " +age);
//        System.out.println("Course:- " +course);
//    }
//
//    public static void main(String[] args) {
//
//        Student so = new Student();
//
//        so.PrintDetails("Manish Yadav",23);
//        so.PrintDetails("Jyoti Yadav",18,"Intermediate");
//    }
//}




//            or


import java.util.Scanner;

class Student{

    public void PrintDetails(String Name, int age){
        System.out.println("Student Name:- " +Name);
        System.out.println("Age:- " +age);
    }

    public void PrintDetails(String Name,int age,String Course){
        System.out.println("Student Name:- " +Name);
        System.out.println("Age:- " +age);
        System.out.println("Course:- " +Course);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student so = new Student();


//          Two Parameters;


        System.out.println("Enter your Student Name:- ");
        String Name = scan.nextLine();

        System.out.println("Enter Student Age:- ");
        int age = scan.nextInt();


        so.PrintDetails(Name,age);


//            Three Parameters;


        System.out.println("Enter Student Name:- ");
        String Name1 = scan.nextLine();

        System.out.println("Enter Student Age:- ");
        int age1 = scan.nextInt();

        System.out.println("Enter Course:- ");
        String course = scan.nextLine();

        so.PrintDetails(Name1,age1,course);

    }

}