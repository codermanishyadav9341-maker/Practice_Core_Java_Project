package Chatgpt_Questions;

 class Shape {
     public void area(){
         System.out.println("Structures has Different Shape");
     }
}

class Rectangle extends Shape{
     public void area(int length,int breath){
         double area_Rectangle = (length*breath);
         System.out.println("Area of Rectangle:- " +area_Rectangle);
     }
}

class Cuboid extends Shape{
     public void Volume(int length,int breath,int height){
         double volume_Of_Cuboid = (length*breath*height);
         System.out.println("Volume of Cuboid:- " +volume_Of_Cuboid);
     }

     public static void main(String[] args){
      Cuboid cc = new Cuboid();
      cc.area();
      cc.Volume(10,20,5);

      Rectangle rr = new Rectangle();
      rr.area(10,20);

     }
}
