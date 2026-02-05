package Java_Roof;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number- ");
        int b = scan.nextInt();

        System.out.print("Choose Options: (+,-,*,/,%%):- ");
        char ch = scan.next().charAt(0);

              switch(ch){

                  case '+':
                     System.out.println("Add:- " +(a+b));
                     break;

                  case '-':
                      System.out.println("Substractions:- " +(a-b));
                      break;

                  case '*':
                      System.out.println("Product:- " +(a*b));
                      break;

                  case '/':
                      System.out.println("Divided:- " +(a/b));
                      break;

                  case '%':
                      System.out.println("Remainders:- " +(a%b));
                      break;


                  default:
                      System.out.println("Invalid Output");
                      break;

        }
    }
}
