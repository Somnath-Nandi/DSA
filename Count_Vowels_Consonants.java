// Write a program to count vowels and consonants in a string. 

// Output should be like: 

// vowels = 2
// consonants = 3 

import java.util.Scanner;

public class Count_Vowels_Consonants {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();

        int vowels = 0, cons = 0;
        l = l.toLowerCase();

        for (int i = 0; i < l.length(); i++) {
            char ch = l.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else
                cons++;
        }
        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + cons);

    }
}
