package Strings;

public class RabinKarpAlgo {
    static void algo(String a, String b ,int q){
        int n = a.length();
        int m = b.length();
        int i,j;
        int p =0; // value for text
        int t =0; //value for text
        int h = 1;
        int d = 10;
        for(i=0;i<n-1;i++){
            h = (h*d)%q;
        }
        for(i=0;i<n-1;i++){
            p = (d*p+a.charAt(i))%q;
            t = (d*t+b.charAt(i))%q;
        }
        for(i=0;i<m-n;i++){
            if(p==t){
                for(j=0;j<n;j++){
                    if(b.charAt(i+j)!=a.charAt(j)){
                        break;
                    }
                    if(j==n){
                        System.out.println("Pattern found at index" +i);
                    }
                    if(i<m-n){
                        t =(d*(t-b.charAt(i)*h) + b.charAt(i+n));
                        if(t<0){
                            t = (t+q);
                        }
                    }
                }
            }
        }
    
    }

    public static void main(String args[]){
        String text = "ccaccaaedba";
        String pattern ="dba";
        int q =101;
        algo(text, pattern, q);
    }
    
}
