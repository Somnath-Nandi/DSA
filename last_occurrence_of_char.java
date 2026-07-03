// Given a string and a character, write a program to find the last occurrence of that character in the string. Output the index(index starts from 0) of the character. Display "Not Found" if the character is not present in the string. 

import java.util.Scanner;

public class last_occurrence_of_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char ch = in.nextLine().charAt(0);
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch2 = input.charAt(i);
            if (ch == ch2)
                index = i;
        }
        if (index != 0)
            System.out.println(index);
        else
            System.out.println("Not Found");
    }
}
