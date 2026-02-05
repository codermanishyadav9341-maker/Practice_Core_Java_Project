package D1_Arrays;

import java.util.Scanner;

//public class Exam {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Array Size:- ");
//        int size = scan.nextInt();
//
//        int arr[] = new  int [size];
//
//        System.out.println("Enter your Array elements:- ");
//
//        for(int i = 0; i<size; i++){
//           arr[i] = scan.nextInt();
//        }
//
//        System.out.print("Array elements:- ");
//
//        for(int i = 0; i<size; i++){
//            System.out.print(arr[i] +" ");
//        }
//
//
//
//    }
//}

//   Questions no. 1;

//public class Exam{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Array Size:- ");
//        int size = scan.nextInt();
//
//        int arr[] = new int[size];
//        int product = 1;
//
//        System.out.println("Enter your Array elements:- ");
//
//        for(int i = 0; i<size; i++){
//            arr[i] = scan.nextInt();
//        }
//
//        System.out.print("Array Elements:- ");
//
//        for(int i = 0; i<size; i++){
//            System.out.print(arr[i] +" ");
//        }
//
//        System.out.println();
//        System.out.print("Products:- ");
//
//        for(int i = 0; i<size; i++){
//            product *= arr[i];
//        }
//        System.out.println(product);
//
//    }
//}


//    Questions no. 2;

//public class Exam{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Array Size:- ");
//        int size = scan.nextInt();
//
//        int arr[] = new int[size];
//        int sumEven = 0;
//        int countEven = 0;
//        int sumOdd = 0;
//        int countOdd = 0;
//
//        System.out.println("Enter your Array elements:- ");
//
//        for(int i = 0; i<size; i++){
//            arr[i] = scan.nextInt();
//
//            if(arr[i]%2==0){
//                sumEven = arr[i];
//                countEven++;
//            }
//             else{
//                 sumOdd = arr[i];
//                 countOdd++;
//            }
//
//        }
//        if(countEven > 0){
//            System.out.println("Average Even number:- " +countEven);
//        }
//         else{
//             System.out.println("No number");
//        }
//
//         if(countOdd > 0){
//             System.out.println("Average Odd number:- " +countOdd);
//         }
//          else{
//              System.out.println("No number");
//         }
//    }
//}


//  Questions no. 3;


public class Exam{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Array Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        int flag = 0;

        System.out.println("Enter your Array Elements:- ");

        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array Elements:- ");

        for(int i = 0; i<size; i++){
            System.out.print(arr[i]);
        }

        System.out.println();

        System.out.print("Searching  number:- ");
        int index = scan.nextInt();

        for(int i = 0; i<size; i++){
            if(index >= 0 && index < size){
                System.out.println("Index Value:- " +index +arr[index]);
                break;
            }
        }

    }
}