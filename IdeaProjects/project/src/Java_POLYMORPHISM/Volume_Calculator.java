package Java_POLYMORPHISM;

 class Volume_Calculator {
     public void Volume(int side){
         int cube = (side*side*side);
         System.out.println("Volume of Cube:- " +cube);
     }

     public void cuboid(int length,int breath,int height){
         int cuboid = (length*breath*height);
         System.out.println("Volume of Cuboid:- " +cuboid);
     }

     public void cylinder(double radius,double height){
         double cylinder = 3.14*radius*radius*height;
         System.out.println("Volume of Cylinder:- " +cylinder);
     }

     public static void main(String[] args){

         Volume_Calculator so = new Volume_Calculator();
         so.Volume(10);
         so.cuboid(10,20,5);
         so.cylinder(10,5);


     }
}
