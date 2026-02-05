package Java_POLYMORPHISM;

 class Area_Calculator {

     int area(int radius){
         int area_Of_Circle = (2*radius*radius);

         return area_Of_Circle;
     }


     int area(int length,int breath){
         int area_Of_Rectangle = (length*breath);
         return area_Of_Rectangle;
     }

     double area(double base, double height){
         double area_Of_triangle = 0.5*(base*height);

         return area_Of_triangle;
     }

     public static void main(String[] args){

         Area_Calculator AC = new Area_Calculator();

         AC.area(10);
         AC.area(10,20);
         AC.area(5.0,10);

         System.out.println("Area of Circle:- " +AC.area(10));
         System.out.println("Area of Rectangle:- " +AC.area(10,20));
         System.out.println("Area of triangle:- " +  AC.area(50.0,10.0));

     }
}
