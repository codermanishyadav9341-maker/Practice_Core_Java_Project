package PLOYMORPHISM_PRACTICE;

 class Volume_Calculator {
     public void volume(int a){
         int volume_of_Cube = (a*a*a);
         System.out.println("Volume of cube:- " +volume_of_Cube);
     }

     public void volume(int length,int breath,int height){
         int volume_of_Cuboid = (length*breath*height);
         System.out.println("Volume of Cuboid:- " +volume_of_Cuboid);
     }

     public void volume(double radius,double height){
         double volume_of_Cylinder = 3.14*(radius*radius*height);
         System.out.println("Volume of cylinder:- " +volume_of_Cylinder);
     }

     public static void main(String[] args){

         Volume_Calculator v = new Volume_Calculator();
         v.volume(10);
         v.volume(10,20,30);
         v.volume(3.5,10);

     }
}


