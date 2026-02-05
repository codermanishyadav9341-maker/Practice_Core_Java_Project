package POLYMORPHISM;

 class Volume_Calculator {

     void volume(int a){
         int volume_of_cube = (a*a*a);
         System.out.println("Volume of cube:- " +volume_of_cube);
     }

     void volume(int length,int breath,int height){
         int volume_of_Cuboid = (length * breath * height);
         System.out.println("Volume of Cuboid :- " +volume_of_Cuboid);
     }
     void volume(double $,int radius,int height){
         double volume_of_Cylinder = ($*radius*radius*height);
         System.out.println("Volume of cylinder:- " +volume_of_Cylinder);
     }
     public static void main(String[] args){

         Volume_Calculator v = new Volume_Calculator();

         v.volume(3);
         v.volume(40,40,40);
         v.volume(3.14,2,5);

     }
}
