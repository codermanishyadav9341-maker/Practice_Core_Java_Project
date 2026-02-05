package Java_Inheritance;

 class Shape1 {
     public void perimeters(){
         System.out.println("Calculating Perimeters.........");
     }
}

class Square extends Shape1{
     double sides;

     Square(double sides){
         this.sides = sides;
     }

     public void perimeters(){
         double square = (4*sides);
         System.out.println("Perimeters of Square:- " +square);
     }
     public static void main(String[] args){

         Square so = new Square(5);
         so.perimeters();
     }
}
