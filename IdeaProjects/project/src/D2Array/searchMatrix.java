package D2Array;

import java.util.Scanner;

public class searchMatrix {
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

        System.out.print("Enter your Index no:- ");
        int num = scan.nextInt();

        boolean flag = false;

//         Searching Index Number;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j] == num){
                    flag = true;
                    System.out.println("Elements found in Index no:- Rows " +i+ " Columns:- " +j);
                }
            }

        }
        if(!flag){
            System.out.println("Elements not found");
        }
    }
}
