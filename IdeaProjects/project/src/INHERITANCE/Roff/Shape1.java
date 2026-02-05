package INHERITANCE.Roff;

 class Shape1 {
     public void perimeters(){
         System.out.println("Calculating perimeters.............");
     }
}

class Square extends Shape1{
     public void perimeters(double sides){
         double square = (4*sides);
         System.out.println("Perimeters Of Square:- " +square);
     }

     public static void main(String[] args){
         Square so = new Square();
         so.perimeters(10);
     }
}
