package Strings;
import java.util.Scanner;

public class ReverseString{
    static void reverse(String s){
        String rev = "";
        for(int i = s.length()-1 ; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed string is : " + rev);
        }  
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1 = sc.nextLine();
        reverse(s1);
        
        sc.close();
    }
}