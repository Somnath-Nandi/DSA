// Write a program to find the sum of digits in a string. Note that string can contain alphabets also 

import java.util.Scanner;

public class Sum_Digits_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        getvalues(s1);
    }

    public static void getvalues(String s1) {
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
