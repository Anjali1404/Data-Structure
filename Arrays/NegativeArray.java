package Arrays;
import java.util.Scanner;

public class NegativeArray {
    static void arrange(int arr[]){
        int j=0 ,i=0 , n =arr.length;

        while(i < n-1 && j < n ) {
            if(arr[i]>=0){
                if(arr[i+1]<0){
                    arr[j] = arr[j] +arr[i+1];
                    arr[i+1] = arr[j] - arr[i+1];
                    arr[j] = arr[j] - arr[i+1];
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
                j++;
            }
            
    }
    System.out.println("Elements are :");
    for(int e: arr){
        System.out.println(e);
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int a[] =new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        arrange(a);
        sc.close();
    }
}
