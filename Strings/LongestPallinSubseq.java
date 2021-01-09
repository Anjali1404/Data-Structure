package Strings;

public class LongestPallinSubseq {
    static void pallindrome(String s){
        int i=0 , j=0;
        String rev="";
        String subseq = "";
        while(i<s.length()){
            rev = rev+s.charAt(i);
            i++;
        }
        while(i<s.length() && j<rev.length()){
            if(s.charAt(i)== rev.charAt(j)){
                subseq = rev;
            }
            i++;
            j++;
        }
        System.out.println("Longest subsequence is : " + subseq);
    }
    public static void main(String args[]){
        String a = "aabbaa";
        pallindrome(a);   
    }
}
