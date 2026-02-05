package Inheritance1;

 class Shape {
     void area(){
         System.out.println("Calculating areas:----");
     }

}

class Rectangle extends Shape{
     void area(int length,int breath){
         int area_of_rectangle = (length * breath);
         System.out.println("Area of Rectangle:-  "  +area_of_rectangle);
     }
     public static void main(String[] args){

         Rectangle r = new Rectangle();
         r.area();
         r.area(10,5);
     }
}