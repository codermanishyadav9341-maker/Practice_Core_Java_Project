//public class Test {
//    public static void main(String[] args){
//
//    }
//}


// Questions no. 1;

//class Animal {
//    void makeSound() {
//        System.out.println("General Animals Sound");
//
//    }
//}
//   class Dog extends Animal{
//        void makeSound(){
//            System.out.println("Dogs Barks");
//        }
//
//       public static void main(String[] args) {
//
//            Dog d = new Dog();
//
//            d.makeSound();
//
//
//       }
//
//}


//   Questions no.2;

//class Calculator{
//    int sum(int a,int b){
//        int sum = (a+b);
//        return sum;
//    }
//
//    int sum(int a, int b ,int c){
//        int result = (a+b+c);
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        Calculator c = new Calculator();
//
//        c.sum(10,20);
//        c.sum(10,20,30);
//
//        System.out.println("Sum of two number is :- " +c.sum(10,20));
//        System.out.println("Sum of Three Number:- " +c.sum(10,20,30));
//    }
//}


// Questions no. 3;

//class Student{
//    private String name;
//    private int age;
//
//
//
//
////     Using Setter;
//    public void setName(String newName){
//        name = newName;
//    }
//
//    public void setAge(int newAge){
//        if(age <= 0){
//            age = 0;
//        }
//         else{
//             System.out.println("Invalid age");
//        }
//    }
//
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//
//    public static void main(String[] args){
//        Student s = new Student();
//        s.setName("Manish");
//        s.setAge(20);
//
//        System.out.println("Student Name:- " +s.getName());
//        System.out.println("Age:- " +s.getAge());
//
//    }
//}


//   Questions no.5;

//class Shape{
//    void area(){
//        System.out.println("Area not Calculated");
//    }
//}
//
//class Circle extends Shape{
//    void area(double pie,int radius){
//        double area_Of_Circle = pie*(radius*radius);
//        System.out.println("Area of Circle:- " +area_Of_Circle);
//    }
//}
//
//class Square extends Shape{
//    void area(double side){
//        double area_Of_Square = (side*side);
//        System.out.println("Area of Square:- " +area_Of_Square);
//    }
//
//    public static void main(String[] args){
//
//        Circle c = new Circle();
//        c.area(3.14,4);
//
//       Square s = new Square();
//       s.area(5);
//
//
//    }
//}


abstract class Vehicle {

    abstract void start();

}
   class Car extends Vehicle{

       void start(){
           System.out.println("Car Starts With ignition Key");
       }
   }

   class Bike extends Vehicle{
    void start(){
        System.out.println("Bike Starts With Kick");
    }

    public static void main(String[] args){

        Bike b = new Bike();
        b.start();

        Car c = new Car();
        c.start();
    }
   }



