package Java_Inheritance_Roof;

public class Student3 {
    String name;

    Student3(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Student Name:- " +name);
    }
}

class MarkSheet extends Student3{
    double chemistry;
    double physics;
    double maths;

    MarkSheet(String name,double chemistry,double physics, double maths){
        super(name);
        this.chemistry = chemistry;
        this.physics = physics;
        this.maths = maths;

    }

    public void display(){
        double total_Marks = (chemistry + physics + maths);
        System.out.println("Student Name:- " +name);
        System.out.println("Total Marks:- " +total_Marks);
    }

    public static void main(String[] args){

        MarkSheet ss = new MarkSheet("Manish Yadav",85,79,96);
        ss.display();
    }
}
