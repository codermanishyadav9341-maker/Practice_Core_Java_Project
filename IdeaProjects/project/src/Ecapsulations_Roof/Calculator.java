package Ecapsulations_Roof;

class Calculator {
    private double result;

//     Constructors;

    Calculator(){
        this.result = 0;
    }

//     Methods;

    public void add(double num ){
        result += num;
        System.out.println("Add:- " +num + " is " +result);
    }
    public void Subtract(double num){
        result -= num;
        System.out.println("Subtract:- " +num +" is " +result);

    }
    public void multiply(double num){
        result *= num;
        System.out.println("Multiply:- " +num+ " is " +result);
    }
    public void divide(double num){
        result /= num;
        System.out.println("Divided:- " +num+ " is " +result);
    }

    public double getResult(){
        return result;
    }

    public void clear(){
        result = 0;
    }

    public static void main(String[] args) {

        Calculator so = new Calculator();

        so.add(10);
        so.Subtract(20);
        so.multiply(30);
        so.divide(40);
        so.getResult();

        System.out.println("---------Calculators:---------------");

        System.out.println("Result:- " +so.getResult());

    }
}
