package Strings;
import java.util.Scanner;

public class StringRotation {

    static boolean isRotation = true;

    static void rotate(String a, String b) {
        if (a == null || b == null) {
            isRotation = false;
        }
        if(a.length() != b.length()){
            isRotation = false;
        }
        else{
            String add = a+a;
            if(add.contains(b)){
                System.out.println("String1 is rotation of String 2");
            }
            else{
                System.out.println("Strings are not rotation of each other");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2 : ");
        String s2 = sc.nextLine();
        rotate(s1 , s2);
        sc.close();
    }
    
}
