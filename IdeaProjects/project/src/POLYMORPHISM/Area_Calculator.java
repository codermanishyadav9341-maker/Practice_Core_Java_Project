package POLYMORPHISM;

public class Area_Calculator {

    void area(int radius , double pie){
        double area_of_Circle = 2*pie*radius;

        System.out.println("Area of circle:- " +area_of_Circle);
    }
    void area(int length, int breath){
        int area_of_rectangle = (length*breath);
        System.out.println("Area of rectangle:- " +area_of_rectangle);
    }
    void area(double base,double height){
        double area_of_triangle = 1/2*(base*height);
        System.out.println("Area of triangle:- " +area_of_triangle);
    }

    public static void main(String[] args) {
        Area_Calculator c = new Area_Calculator();
        c.area(2,3.14);
        c.area(10,20);
        c.area(2,5);
    }
}
