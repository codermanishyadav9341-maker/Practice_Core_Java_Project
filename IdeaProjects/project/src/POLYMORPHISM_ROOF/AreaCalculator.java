package POLYMORPHISM_ROOF;

public class AreaCalculator {

    public double area(int radius){
        double area_of_Circle = 3.14*radius*radius;
        return area_of_Circle;
    }

    public double area(int length,int breath){
        double area_of_Rectangle = 2*(length*breath);
        return area_of_Rectangle;
    }

    public double area(double base,double height){
        double area_of_Rectangle = 0.5*base*height;
        return area_of_Rectangle;
    }

    public static void main(String[] args){

        AreaCalculator so = new AreaCalculator();
        so.area(10);
        so.area(10,5);
        so.area(1.5,20);

        System.out.println("Area Of Circle:- " +so.area(10));
        System.out.println("Area of Rectangle:- " +so.area(10,5));
        System.out.println("Area of Triangle:- " +so.area(5.0,2.0));


    }
}
