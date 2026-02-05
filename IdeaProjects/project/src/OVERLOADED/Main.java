package OVERLOADED;

public class Main{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b , int c){
        return a+b+c;
    }

    double add(int a, int b, int c , int d){

        return a+b+c+d;

    }

    public static void main(String[] args) {

        Main s = new Main();

        s.add(10,50);
        s.add(10 , 20 , 30);
        s.add(10 , 20 , 30 , 40);


        System.out.println("value of add1:- "  +s.add(10,50));
        System.out.println("Value of add2:- " + s.add(10 , 20 , 30));
        System.out.println("Value of add3:- " + s.add(10 , 20 , 30 , 40));


    }
}

