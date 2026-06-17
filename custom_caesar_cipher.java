// Problem Statement

// The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
// For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
// To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
// Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
// As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
// For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is. Key value less than 0 should result into “INVALID INPUT”

// Example 1:
// Enter your PlainText: All the best
// Enter the Key: 1

// The encrypted Text is: Bmm uif Cftu

// Write a function CustomCaesarCipher(int key, String message) which will accept plaintext and key as input parameters and returns its cipher text as output.

import java.util.Scanner;

public class custom_caesar_cipher {
    public static String CustomCaesarCipher(int key, String message) {
        String cipheredMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            int ch_value = (int) ch;
            if (ch_value >= 48 && ch_value <= 57) {
                if (ch_value + key <= 57)
                    ch_value += key;
                else
                    ch_value = 47 + (ch_value + key) - 57;
            }
            if (ch_value >= 65 && ch_value <= 90) {
                if (ch_value + key <= 90)
                    ch_value += key;
                else
                    ch_value = 64 + (ch_value + key) - 90;
            }
            if (ch_value >= 97 && ch_value <= 122) {
                if (ch_value + key <= 122)
                    ch_value += key;
                else
                    ch_value = 96 + (ch_value + key) - 122;
            }
            cipheredMessage = cipheredMessage + (char) ch_value;
        }
        return cipheredMessage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PlainText:");
        String message = sc.nextLine();
        System.out.print("\nEnter the Key:");
        int key = sc.nextInt();
        if (key < 0)
            System.out.println("INVALID INPUT");
        else
            System.out.println("\nThe encrypted Text is:" + CustomCaesarCipher(key, message));
    }
}
