package Java_POLYMORPHISM;

class Student {

    public void printDetails(String name,int age){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
    }

    public void printDetails(String name,int age,String course){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Student so = new Student();
        so.printDetails("Manish Yadav",23);
        so.printDetails("Ronit",23,"B.Tech");
    }
}

