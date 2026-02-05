package INHERITANCE.Roff;

 class Shape {

     public void area(){
         System.out.println("Calculating area.............");
     }
}

class Rectangle extends Shape{
     int length;
     int breath;

     Rectangle(int length,int breath){
         this.length = length;
         this.breath = breath;
     }

     public void area(){
         int area = (length*breath);
         System.out.println("Area of Rectangle:- " +area);
     }

     public static void main(String[] args){
         Rectangle so = new Rectangle(10,5);
         so.area();
     }
}
