package Arrays;
import java.util.Arrays;


public class UnionIntersection {
    static void Union(int a[] , int b[]){
        int i=0 ,j=0, k=0;

        while(i<a.length && j<b.length){
            while((i<a.length-1) && (a[i]==a[i+1])){
                i++;
            }
            while((j<b.length-1)&&(b[j]==b[j+1])){
                j++;
            }
            if(a[i]>b[j]){
                k=a[i];
                i++;
            }
            else{
                if(a[i]<b[j]){
                    k=b[j];
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
            System.out.println(k );
        
        }
        
        

       
    }
    public static void main(String[] args){
        

        int a1[] = {2,4,5,6,7,7};
        int a2[] = {1,2,2,2,2,3,4,5,7};
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println("Union is : ");
        Union(a2,a1);
    }
    
}
