package Encapsulations_Practice;

 class Circle {
     private double radius;

     Circle(double radius){
         this.radius = radius;
     }

     public void setRadius(double radius){
         if(radius > 0){
             this.radius = radius;
         }
          else{
              System.out.println("Radius is not negative");
         }
     }

     public double getRadius(){
         return radius;
     }

     public double getArea(){
         double area = 3.14*radius*radius;
         return area;
     }

     public double getCircumference(){
         double circumference = 2*3.14*radius;
         return circumference;
     }

     public double getDiameters(){
         double diameters = 2*radius;
         return diameters;
     }

     public static void main(String[] args){

         Circle so = new Circle(10);

         so.setRadius(-25);
         so.getArea();
         so.getCircumference();
         so.getDiameters();
         so.getRadius();



         System.out.println("----------Area Calculations-----------");

         System.out.println("Radius:- " +so.getRadius());
         System.out.println("Area of Circle:- " +so.getArea());
         System.out.println("Circumference Of circle:- " +so.getCircumference());
         System.out.println("Diameters Of Circle:- " +so.getDiameters());

     }

}
