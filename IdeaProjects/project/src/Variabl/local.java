package Variabl;

//public class local {
//
//    void sum(int a, int b){
//        int c = a+b;
//        System.out.println("Sum is:- " +c);
//    }
//
//    void sub(int d, int e){
//        int f = (d-e);
//
//        System.out.println("Sub:- " + f);
//    }
//    public static void main(String[] args){
//
//        local l = new local();
//        local k = new local();
//int a=10;
//int b=5;
//        l.sum(a,b);
//
//        int d = 50;
//        int e = 10;
//
//        l.sub(d,e);
//
//
//
//
//
//
//
//
//    }
//}



public class local{

  static  int a = 20;   // Instance Variable;

    public static void main(String[] args){

        local l = new local();
        local m = new local();
        local p = new local();

        l.a = 10;
        m.a = 30;
        p.a = 50;


        System.out.println("Value a is :- " +l.a);

        System.out.println("Value a is " +m.a);
    }
}
