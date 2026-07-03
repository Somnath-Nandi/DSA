// Given a string, check if it is a rotation of a palindrome. For example your function should return 1 for “aab” as it is a rotation of “aba”. 

import java.util.Scanner;

public class Rotation_of_a_Palindrome {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean isRotationOfPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String rotation = str.substring(i) + str.substring(0, i);
            if (isPalindrome(rotation))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println((isRotationOfPalindrome(a)) ? 1 : 0);
    }
}
