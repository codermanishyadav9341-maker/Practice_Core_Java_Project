package POLYMORPHISM_ROOF;

public class VolumeCalculator {
    public void Volume(int side){
        int volume_of_Cube = (side*side*side);
        System.out.println("Volume of Cuboid:- " +volume_of_Cube);
    }

    public void volume(int length,int breath,int height){
        int volume_of_Cuboid = (length*breath*height);
        System.out.println("Volume Of Cuboid:- " +volume_of_Cuboid);
    }

    public void volume(double radius,double height){
        double volume_of_Cylinder = 3.14*(radius*radius*height);
        System.out.println("Volume of Cylinder:- " +volume_of_Cylinder);
    }

    public static void main(String[] args){

        VolumeCalculator cc = new VolumeCalculator();
        cc.Volume(3);
        cc.volume(10,2,5);
        cc.volume(5,6.5);

    }
}
