package Arrays;
import java.util.Scanner;

public class ReverseArray{
        static void reverseArray(int arr[]){

            /* with third variable 

            int temp, start=0,end=arr.length-1;
            while(start<end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
                }
            */

            int start = 0 , end = arr.length-1;
            while(start<end){
                arr[start] = arr[start]+arr[end];
                arr[end] = arr[start]-arr[end];
                arr[start]= arr[start]-arr[end];

                start++;
                end--;
            }
            }

        static void printArray(int arr[]){
            for(int i =0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int  arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("Reversed array is : ");
        printArray(arr);    
        sc.close();
    }
}