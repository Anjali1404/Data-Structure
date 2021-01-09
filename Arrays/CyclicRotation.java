package Arrays;
import java.util.Scanner;

public class CyclicRotation {
    static void rotate(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i]+arr[i-1];
            arr[i-1] = arr[i]-arr[i-1];
            arr[i] = arr[i]-arr[i-1];
        }

        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Cyclic Rotated array is : ");
        rotate(a);
        sc.close();

    }

   
}
