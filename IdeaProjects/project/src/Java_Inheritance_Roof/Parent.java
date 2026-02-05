package Java_Inheritance_Roof;

 class Parent {

    Parent(){
        System.out.println("Parents Constructors Called");
    }
}

class Student extends Parent{

    Student(){
        super();
        System.out.println("Student Constructors Called");
    }

    public static void main(String[] args){

        Student ss = new Student();

    }
}
