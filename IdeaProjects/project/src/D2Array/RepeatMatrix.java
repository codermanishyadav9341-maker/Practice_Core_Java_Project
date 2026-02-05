package D2Array;

import java.util.Scanner;

public class RepeatMatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Columns:- ");
        int columns = scan.nextInt();

        int matrix[][] = new int[rows][columns];
        int temp[] = new int[rows*columns];
        int k = 0;


        System.out.println("Enter your Matrix Elements:- ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = scan.nextInt();
                temp[k++] = matrix[i][j];
            }
        }

        System.out.println("Matrix:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Ascending Orders:- ");
        for(int i = 0; i<rows*columns-1; i++){
            for(int j = 0; j<rows*columns-i-1; j++){
                if(temp[j] > temp[j+1]){
                    int t = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = t;
                }
            }


        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = temp[k++];
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] +" ");
            }
        }
        System.out.println();
    }
}
