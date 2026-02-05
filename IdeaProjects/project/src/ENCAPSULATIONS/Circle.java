package ENCAPSULATIONS;

 class Circle {
     private double radius;

     double pie = 3.14;

     public void setRadius(double newRadius) {
         radius = newRadius;
     }

     public double getRadius(double diameters){
         radius = diameters/2;
         return radius;
     }

     public double getArea(){


         double area_of_circle = 2*pie*radius*radius;

         return area_of_circle;
     }

     public double getCircumference(){

         double circumference_of_Circle = 2*pie*radius;
         return circumference_of_Circle;
     }

     public double getDiameter(){

       double  diameters = 2*radius;
         return diameters;

     }

     public static void main(String[] args){

         Circle c = new Circle();
         c.setRadius(10);
         c.getDiameter();
         c.getArea();
         c.getCircumference();

         System.out.println("----Circle------");
         System.out.println("Circle of Radius:- " +c.getRadius(10));
         System.out.println("Area of Circle:- " +c.getArea());
         System.out.println("Circumference of Circle:- " +c.getCircumference());
         System.out.println("Diameters of Circle:- " +c.getDiameter());
     }


 }
