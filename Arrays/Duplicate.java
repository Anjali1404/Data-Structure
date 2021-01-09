package Arrays;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args){
        int a[] = {2,1,3,4,6,7,5,6};
        int i=0 ,j=0;
        Arrays.sort(a);
        while(i<a.length-1){
            if(a[i]==a[i+1]){
                j= a[i];
            }
            i+=1;
        }
        System.out.println("Duplicate element is : " + j);
        }
    }

