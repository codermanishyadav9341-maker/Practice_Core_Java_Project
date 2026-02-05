package Inheritance1;

class Shap1 {
    void perimeters(){
        System.out.println("Calculating area...............");
    }
}

class Square extends Shap1{
    void perimeters(int sides){
        int perimeters_of_Square = (4 * sides);
        System.out.println("Perimeters of Square:- " +perimeters_of_Square);
    }
    public static void main(String[] args){

        Square so = new Square();
        so.perimeters();
        so.perimeters(5);
    }
}
