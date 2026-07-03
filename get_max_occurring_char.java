// Write a program to print the highest frequency character in a string. 

import java.util.Scanner;

public class get_max_occurring_char {
    static char getMaxOccuringChar(String str) {
        int freq = 0, max = 0;
        char max_ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2)
                    freq++;
                if (freq > max) {
                    max = freq;
                    max_ch = ch;
                }
            }
        }
        return max_ch;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(getMaxOccuringChar(s));
    }
}
