package D1_Arrays;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter your Delete number:- ");
        int num = scan.nextInt();

        int flag = -1;

        for(int i = 0; i<size; i++){
            if(arr[i] == num){
                flag = i;
                break;
            }
        }

//         Shift elements:-



    }
}
