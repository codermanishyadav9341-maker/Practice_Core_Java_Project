package JavaArray_2D;

import java.util.Scanner;

public class Equal_Matrix {
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

        System.out.println("first Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//         Second Matrix;

        int matrix2[][] = new int[rows][columns];

        System.out.println("Enter Your Second Matrix elements:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Second Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        boolean flag = true;

//        two matrix are equal;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j] != matrix2[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("Two Matrix are equal");
        }
         else{
             System.out.println("Two matrix are not equal");
        }
    }
}
