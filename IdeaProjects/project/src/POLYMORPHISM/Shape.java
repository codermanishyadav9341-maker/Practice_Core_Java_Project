package POLYMORPHISM;

 class Shape {
     void draw(){
         System.out.println("Drawing Shape");
     }
}
 class circle extends Shape{
     void draw(){
         System.out.println("Drawing Circle");
     }

     void draw(int radius){
         System.out.println("Drawing Circle of radius is " +radius);
     }
 }
 class Rectangle extends Shape{
     void draw(){
         System.out.println("Drawing Rectangle");
     }

     public static void main(String[] args) {

         Shape s = new Shape();
         s.draw();

         Rectangle r = new Rectangle();
         r.draw();

         circle c = new circle();
         c.draw();
         c.draw(10);



     }
 }


