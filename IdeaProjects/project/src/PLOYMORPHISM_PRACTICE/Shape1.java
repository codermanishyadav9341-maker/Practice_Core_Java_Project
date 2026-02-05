package PLOYMORPHISM_PRACTICE;

class Shape1 {
    public void PrintShape(){

        System.out.println("This is a Shape");
    }
}

class Square extends Shape1{
    public void PrintShape(){
        System.out.println("This is a Square");
    }
}

class Triangle extends Shape1{
    public void PrintShape(){
        System.out.println("This is a Triangle");
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.PrintShape();

        Square s = new Square();
        s.PrintShape();

        Shape1 so = new Shape1();
        so.PrintShape();



    }
}



