package Strings;
import java.util.Scanner;

public class PallindromeString {
    static void pallindrome(String s){
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s1 = sc.nextLine();
        pallindrome(s1);
       
        sc.close();
    }
}
