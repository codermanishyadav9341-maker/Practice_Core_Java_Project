package D2Array;

import java.util.Scanner;

public class SumColumnsMatrix {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.println("Enter your Matrix Elements:- ");
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

//         Sum each Columns;


        for(int j = 0; j<columns; j++){
            int sumColumns = 0;
            for(int i = 0; i<rows; i++){

                sumColumns += matrix[i][j];
            }

            System.out.println("Sum of Columns:- " +sumColumns);

        }
    }
}
