package JavaArray_2D;

import java.util.*;

public class Max_Elements {
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
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       int max = matrix[0][0];
        int min = matrix[0][0];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j] > max)
                    max = matrix[i][j];

                if(matrix[i][j] < min)
                    min = matrix[i][j];

            }
        }

        System.out.println("Maximum elements:- " +max);
        System.out.println("Minimum elements:- " +min);
    }
}
