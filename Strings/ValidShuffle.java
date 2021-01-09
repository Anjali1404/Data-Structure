package Strings;


public class ValidShuffle{
    static boolean shuffle(String x , String y , String result) {
        int i = 0, j = 0, k = 0;
        if(x.length()+y.length()!= result.length()){
            return false;
        }
        while(k!=result.length()){
            if(i<x.length() && x.charAt(i)==result.charAt(k))
            i++;
            else
                if(j<y.length() && y.charAt(j) == result.charAt(k)){
                j++;
                }
                else{
                    return false;
                }
            k++;
        }

        if(i < x.length() || j < y.length()) {
            return false;
          }
      
          return true;
    
    }
    public static void main(String[] args){
        String a = "xy";
        String b ="12";
        String[] result = {"1xy2" ,"y12x" ,"xy12xy12"};
        for(String p: result){
            if(shuffle(a, b, p)== true){
                System.out.println("String "+ p + " is a shuffle of " + a + " and " + b);
            }
            else{
                System.out.println("String "+ p + " is not a shuffle of " + a + " and " + b);
            }
        }

    }
}