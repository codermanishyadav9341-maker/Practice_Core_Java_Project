package Java_Encapsulations;

 class Rectangle {
     private double length;
     private double width;

//      Using Constructor;

     Rectangle(double length,double width){
         this.length = length;
         this.width = width;
     }

     public void setLength(){
         if(length >= 0){
             length = length;
         }
          else{
              System.out.println("Length Cannot Negative");
         }
     }

     public void setWidth(){
        if(width >= 0){
            width = width;
        }
         else{
             System.out.println("Width Cannot negative");
        }
     }

     public double getLength(){
         return length;
     }

     public double getWidth(){
         return width;
     }

     public double getArea(){
         double area_Of_Rectangle = (length * width);
         return area_Of_Rectangle;
     }

     public double getPerimeters(){
         double perimeter_Of_Rectangle = 2*(length+width);
         return perimeter_Of_Rectangle;
     }

     public boolean getIsSquare(){
        return (length  == width);
     }

     public static void main(String[] args){
         Rectangle so = new Rectangle(10,20);

         so.getArea();
         so.getPerimeters();
         so.getIsSquare();


         System.out.println("Area of Rectangle:- " +so.getArea());
         System.out.println("Perimeters Of Rectangle:- " +so.getPerimeters());
         System.out.println("Area of Square:- " +so.getIsSquare());

     }
}
