package Strings;
import java.util.Scanner;

public class DuplicateChar {
    static void duplicate(String s){
        String characters="";
        String duplicates="";
        for(int i=0;i<s.length();i++){
            String current = Character.toString(s.charAt(i));
            if(characters.contains(current)){
                if(!duplicates.contains(current))
                duplicates+=current;
            }
           characters+=s.charAt(i);
         
        }
        System.out.println("Duplicate characters are :" + duplicates);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s1  = sc.nextLine();
        duplicate(s1);
        sc.close();
    }
    
}
