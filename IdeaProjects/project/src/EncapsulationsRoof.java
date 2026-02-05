//public class EncapsulationsRoof {
//}

//class Calculator{
//    private int result;
//
//    Calculator(int result){         // Using Constructors;
//        this.result = 0;
//    }
//
//
//     Using  methods;
//
//    public void add(double num){
//        num += result;
//        System.out.println("Add:- " +num);
//    }
//
//    public void subtract(double num){
//        num -= result;
//        System.out.println("Subtract:- " +num);
//    }
//
//    public void multiply(double num){
//        num *= result;
//        System.out.println("Multiply:- " +num);
//    }
//
//    public void divide(double num){
//        num /= result;
//        System.out.println("Divided:- " +num);
//    }
//
//    public double getResult(){
//        return result;
//
//    }
//
//    public void clear(){
//        result = 0;
//    }
//
//    public static void main(String[] args) {
//
//        Calculator c = new Calculator(10);
//        c.add(10);
//        c.subtract(40);
//        c.multiply(5);
//        c.divide(30);
//        c.getResult();
//
//        System.out.println("Final Result:- " +c.getResult());
//    }
//
//}


//  Questions no. 2;


class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double pie = 3.14;

    public void setRadius(double radius){
        radius = radius;
        System.out.println("Radius:- " +radius);
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){

        double area_Of_Circle = pie*radius*radius;
        return area_Of_Circle;

    }

    public double getCircumference(){
        double circumference_Of_Circle = 2*pie*radius*radius;
        return circumference_Of_Circle;
    }

    public double getDiameters(){
        double diameters_Of_Circle = 2*radius;

        return diameters_Of_Circle;
    }

    public static void main(String[] args) {

        Circle c = new Circle(10);
        c.setRadius(10);
        c.getArea();
        c.getCircumference();
        c.getDiameters();

        System.out.println("------------------:Circle:-----------------------");
        System.out.println("Area of Circle:- " +c.getArea());
        System.out.println("Circumference Of circle:- " +c.getCircumference());
        System.out.println("Diameter of Circle:- " +c.getDiameters());


    }

    static class Book {
       private String title;
       private String author;
       private String isbn;
       private int pages;
       private boolean isAvailable;

       Book(String Title,String Author,String Isbn,int Pages){
           this.title = Title;
           this.author = Author;
           this.isbn = Isbn;
           this.pages = Pages;

       }
   }
}