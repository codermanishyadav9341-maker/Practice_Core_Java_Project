package D2Array;

import java.util.Scanner;

public class PresentMatrix {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.println("Enter your Matrix elements:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

//       Present In Array;

        boolean found = false;

        System.out.print("Searching elements:- ");
        int num = scan.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j] == num){
                    found = true;

                    System.out.print("This number Present in Array" +num);
                }
            }
        }
        if(!found){
            System.out.print("This number is not Present");
        }

    }
}
