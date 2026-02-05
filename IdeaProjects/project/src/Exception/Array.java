package Exception;

import java.util.ArrayList;


public class Array {
    public static void main(String[] args){



        try{

            int arr[] = {10,20,30,40,50};
            
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Invalid ArrayIndex");
        }
    }
}
