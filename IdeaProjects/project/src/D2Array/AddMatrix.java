package D2Array;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];

        System.out.println("Enter your First Matrix Elements:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Enter your Second Matrix elements:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }

        int sum = 0;

        System.out.println("Adding two Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){

                sum = matrix1[i][j] + matrix2[i][j];

                System.out.print(sum +" ");
            }
            System.out.println();
        }

    }
}
