package Arrays;
import java.util.Scanner;

public class SortingArray{

    static void sort012(int a[]){
        int zero = 0;
        int one = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]==0){
                zero++;
            }
            else{
                if(a[i]==1){
                    one++;
                }
            }
        }
            for(int i =0; i<a.length; i++){
            if(zero >= i+1){
                a[i] = 0;
            }
            else if(zero + one >= i+1) {
                a[i]= 1;
            }
            else {
                a[i] = 2;
            }
            System.out.println("Sorted array is : " + a[i]);
          }
             
        }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sort012(a);
        sc.close();
    }
}