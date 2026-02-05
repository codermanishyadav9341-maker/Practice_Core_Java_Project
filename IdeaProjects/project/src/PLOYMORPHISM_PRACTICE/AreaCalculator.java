package PLOYMORPHISM_PRACTICE;

// class AreaCalculator{
//
//
//     double area(int radius){
//
//        return 3.14*radius*radius;
//     }
//
//     double area(int length,int breath){
//         return length*breath;
//     }
//
//     double area(double base , double height){
//         return base * height;
//     }
//
//     public static void main(String[] args) {
//
//         AreaCalculator so = new AreaCalculator();
//         so.area(10);
//         so.area(10,20);
//         so.area(60,50.0);
//
//         System.out.println("Area of Circle:- " +so.area(10));
//         System.out.println("Area of rectangle:- " +so.area(10,20));
//         System.out.println("Area of Triangle:- " + so.area(60,50.3));
//
//
//     }
//}



//       or


import java.util.Scanner;

class Area_Calculator{

    double area(int radius){

        return 3.14*radius*radius;
    }

    double area(int length,int breath){
        return length*breath;
    }

    double area(double base , double height){
        return 0.5*base*height;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Area_Calculator so = new Area_Calculator();

        System.out.print("Enter your Radius:- ");
        int radius = scan.nextInt();

        so.area(radius);

        System.out.println("Area of Circle:- " +so.area(radius));


//          Area of Rectangle;

        System.out.print("Enter your Length:- ");
        int length = scan.nextInt();

        System.out.print("Enter your Breath:- ");
        int breath = scan.nextInt();

        so.area(length,breath);

        System.out.println("Area of Rectangle:- " +so.area(length,breath));


//           Area of Triangle;

        System.out.print("Enter your Base:- ");
        double base = scan.nextInt();

        System.out.print("Enter your Height:- ");
        double height = scan.nextInt();

        so.area(base,height);

        System.out.println("Area of Triangle:- " +so.area(base,height));



    }
}