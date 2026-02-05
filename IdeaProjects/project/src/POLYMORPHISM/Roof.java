package POLYMORPHISM;

//public class Roof {
//    void add(int a, int b){
//        int c = (a+b);
//        System.out.println("Sum of two number is :- " +c);
//    }
//
//    void add(int a , int b , int c){
//        int sum = (a+b+c);
//        System.out.println("Sum of three number is :- " +sum);
//
//    }
//    public static void main(String[] args) {
//
//        Roof so = new Roof();
//
//        so.add(10,20);
//        so.add(10,20,30);
//
//    }
//}


//   Questions no. 2;

//class Roof{
//    void Student_PrintDetails(String name, int age){
//        System.out.println("Student Name:- " +name+ " and" +" Age:- " +age);
//    }
//
//    void Student_PrintDetails(String name,int age,String course) {
//
//        System.out.println("Student Name:- " +name +", Age:- " +age + " , Course:- " +course);
//
//        }
//
//        public static void main(String[] args){
//
//        Roof su = new Roof();
//
//        su.Student_PrintDetails("Manish" ,20);
//        su.Student_PrintDetails("Ronit" , 22, "B.Tech");
//        }
//    }


//public class Roof{
//    void area(int radius, float pie){
//        float area_of_Circle = 2*(pie*radius);
//        System.out.println("Area of Circle:- " +area_of_Circle);
//
//    }
//
//    void area(int length,int breath){
//        int area_of_rectangle = (length*breath);
//
//        System.out.println("Area of rectangle = " +area_of_rectangle);
//    }
//
//    void area(double base , double height){
//        double area_of_triangle = 1/2*(base*height);
//        System.out.println("Area of triangle = " +area_of_triangle);
//    }
//
//    public static void main(String[] args){
//
//        Roof so = new Roof();
//
//        so.area(10,3.14f);
//        so.area(10,20);
//        so.area(10,5);
//
//    }
//}


 class Roof{
    void sound(){
        System.out.println("Animal has Different Sound");
    }

    static class Animal extends Roof{
        void makeSound(){
            System.out.println("Animals makes Sound");
        }
    }
   static class Dog extends Animal{
        void makeSound(){
            System.out.println("Dog barks");
        }
    }
    static class cat extends Animal{
        void makeSound(){
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args){
        Roof so = new Roof();
        so.sound();

        Animal a = new Animal();
        a.makeSound();

        cat C = new cat();
        C.makeSound();
    }
}