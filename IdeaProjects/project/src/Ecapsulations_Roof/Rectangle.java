package Ecapsulations_Roof;

 class Rectangle {
     private double length;
     private double width;

     Rectangle(double length, double width){
         this.length = length;
         this.width = width;
     }

     public void setLength(){
         if(length > 0)
         length = length;
     }
     public void setWidth(){
         if(width > 0)
         width = width;
     }

     public double getLength(){
         return length;
     }

     public double getWidth(){
         return width;
     }

     public double getArea(){
         double area = (length * width);
         return area;
     }

     public double getPerimeters(){
         double perimeters = 2*(length*width);
         return perimeters;
     }

     public boolean getIsSquare(){
         boolean square = (length == width);
         return square;
     }

     public static void main(String[] args) {

         Rectangle so = new Rectangle(10,20);
         so.setLength();
         so.setWidth();
         so.getArea();
         so.getPerimeters();
         so.getIsSquare();

         System.out.println("-------------Rectangle-----------");
         System.out.println("Area of Rectangle:- " +so.getArea());
         System.out.println("Perimeters of Rectangle:- " +so.getPerimeters());
         System.out.println("Square:- " +so.getIsSquare());
     }

}
