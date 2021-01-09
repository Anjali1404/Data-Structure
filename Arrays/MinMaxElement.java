package Arrays;
import java.util.Scanner;



public class MinMaxElement {

    public static void main(String args[]){
        int max ,min , j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0 ; i<n;i++){
            a[i]= sc.nextInt();
        }
        sc.close();

        if(a.length==1){
            max = a[0];
            min = a[0];
        }

        else{
            if(a.length%2==0){
                if(a[0]>a[1]){
                    max = a[0];
                    min = a[1];
                }
                else{
                        max = a[1];
                        min = a[0];
                    }
                    j=2;
                }
            else{
                max  = a[1];
                min = a[0];
            }
            j=1;
            }

        for(j=a.length-1;j>0;j--){
            if(a[j-1]>a[j]){
                if(a[j-1]>max){
                    max =a[j-1];
                }
                if(a[j]<min){
                    min=a[j];
                }
                
            else{
                if(a[j]>max){
                    max= a[j];
                }
                if(a[j-1]<min){
                    min = a[j-1];
                }
                j+=2;
            }
        }
           
        }
        System.out.println("Max no is : " + max);
        System.out.println("Min no is : " + min);
    }

        

    }      
    

