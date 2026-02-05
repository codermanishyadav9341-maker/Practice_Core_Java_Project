package D2Array;

import java.util.Scanner;

public class EqualMatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix1[][] = new int[rows][columns];

        System.out.println("Enter your first Matrix elements:- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("First Matrix:- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

//     ..............................Second Matrix.......................................................................................




        int matrix2[][] = new int[rows][columns];

        System.out.println("Enter your 2nd Matrix elements:- ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.println("2nd Matrix:- ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

//        ..............Two Matrix are equal.....................
        boolean flag = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix1[i][j] != matrix2[i][j]) {
                    flag = false;
                    break;
                }

            }

        }

        if(flag){
            System.out.println("Matrix are equally");
        }
         else{
             System.out.println("Matrix are not equally");
        }
    }
}
