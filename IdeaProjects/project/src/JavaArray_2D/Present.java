package JavaArray_2D;

import java.util.Scanner;

public class Present {
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

        int flag = 0;
        System.out.print("Searching Matrix elements:- ");
        int num = scan.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j] == num){
                    flag = 1;
                    break;
                }
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){

                if(flag == 1){
                    System.out.println("This elements Present In Matrix:- " +num+ " in Index No:- [" +i+ " " +j+ "]");
                    break;
                }
                else{
                    System.out.println("This elements is not Present in Matrix:- " +num);
                }
            }
        }

    }
}
