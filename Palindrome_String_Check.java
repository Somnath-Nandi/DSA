// Write a program to check if a string is a palindrome or not. Output 1 if palindrome, otherwise print 0. 

import java.util.Scanner;

public class Palindrome_String_Check {
    public static void main(String args[]) {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        a = s.nextLine();

        b = new StringBuilder(a).reverse().toString();

        if (a.equals(b) == true)
            System.out.println("1");
        else
            System.out.println("0");

    }
}
