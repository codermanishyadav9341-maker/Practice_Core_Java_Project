package JavaArray_2D;

import java.util.*;

public class Sum_Matrix {

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

        int sum = 0;

        System.out.print("Matrix sum of all elements:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}
