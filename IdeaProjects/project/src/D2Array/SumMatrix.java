package D2Array;

import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix[][] = new int[rows][columns];
        int sum = 0;

        System.out.println("Enter your Matrix elements:- ");
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
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

            System.out.print("Sum of Matrix all elements:- ");
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    sum += matrix[i][j];


                }

            }

        System.out.print(sum);

    }
}
