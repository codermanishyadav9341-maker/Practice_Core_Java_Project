package ROOF;

//import java.util.Scanner;
//
//public class OPERATORS {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your second number:- ");
//        int b = scan.nextInt();
//
//        int sum = (a+b);
//
//        System.out.print("Sum of two number:- " +sum);
//
//    }
//}




// Questions no. 2;

//import java.util.Scanner;
//
//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int sub = (a-b);
//
//        System.out.print("Substractions of a and b is:- " +sub);
//
//    }
//}



//  Questions no .3;

//import java.util.Scanner;
//
//public class OPERATORS{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int product = (a*b);
//
//        System.out.print("Multiplications:- " +product);
//
//    }
//}

// Questions no. 4;

//import java.util.Scanner;
//
//public class OPERATORS{
//       public static void main(String[] args){
//
//           Scanner scan = new Scanner(System.in);
//
//           System.out.print("Enter your first number:- ");
//           int a = scan.nextInt();
//
//           System.out.print("Enter your Second number:- ");
//           int b = scan.nextInt();
//
//           int division = (a/b);
//
//           System.out.print("Divided :- " +division);
//       }
//}



// Questions no. 5;

//import java.util.Scanner;
//
//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int remainders = (a%b);
//
//        System.out.print("Remainder of a and b is:- " +remainders);
//    }
//}


import java.util.Scanner;

//// Questions no. 6;
//
//
//
//import java.util.Scanner;
//
//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int a = scan.nextInt();
//
//        int inc = a++ + a++ + ++a + ++a + a++;
//
//        System.out.print("Sum of all number is:- " +inc);
//
//    }
//}


// Questions no.7;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int a = scan.nextInt();
//
//        int dec = a-- + a-- - --a - --a + --a;
//
//        System.out.print("Value of Dec :- " +dec);
//
//    }
//}


// Questions no.8;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your second number:- ");
//        int b = scan.nextInt();
//
//       if((a != 0) && (b != 0)){
//           System.out.print("True");
//       }
//        else{
//            System.out.print("False");
//       }
//    }
//}


// Questions no. 9;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        if((a != 0) || (b != 0)){
//            System.out.print("True");
//        }
//         else{
//             System.out.print("False");
//        }
//    }
//}

// Questions no. 10;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.println("Before Swapping:- ");
//        System.out.println("a = " +a + " b = " +b);
//
//        System.out.println("<---------------------------->");
//
//       a = a+b;
//       b = a-b;
//       a = a-b;
//
//       System.out.println("After Swapping");
//       System.out.print("a = " +a + " b = " +b);
//
//
//    }
//}


// Questions no . 12;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        System.out.print("Enter your Shift:- ");
//        int shift = scan.nextInt();
//
//        int result = (num << shift);
//
//        System.out.print("Value of LeftShift is:- " +result);
//
//    }
//}


// Questions no. 13;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        System.out.print("Enter your Shift:- ");
//        int shift = scan.nextInt();
//
//        int right_Shift = (num >> shift);
//
//        System.out.print("Value of Right Shift is:- " +right_Shift);
//
//    }
//}


//   Questions no. 14;

//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.println("Before Swap:- ");
//        System.out.println("a = " +a + " b = " +b);
//
//        System.out.println("<------------------------------>");
//        a = a^b;
//        b = a^b;             //    USING Bitwise XOR Operator;
//        a = a^b;
//
//       System.out.println("After Swap:- ");
//
//       System.out.print("a = " +a + " b = " +b);
//
//    }
//}



// Questions no . 15;


//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Radius:- ");
//        int r = scan.nextInt();
//
//        float $ = 3.14f;
//
//        float area_of_circle = 2*$*r;
//
//        System.out.print("Area Of Circle:- " +area_of_circle);
//
//    }
//}


// Questions no. 16;


//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int result = (a&b);
//
//        System.out.print("Bitwise AND Operators is:- "  +result);
//
//
//
//    }
//
//}



// Questions no. 17;


//public class OPERATORS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int result = (a|b);
//
//        System.out.print("Bitwise OR Operators:- " +result);
//
//    }
//}



// Questions no. 18;

public class OPERATORS{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        int result = (a^b);

        System.out.print("Bitwise XOR Operators:- " +result);

    }
}