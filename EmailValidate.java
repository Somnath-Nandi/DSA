// Write a program to validate an entered email address using regular expressions and print true, if validate otherwise print false. 

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    public static boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile("[a-zA-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        System.out.println(validateEmailAddress(email));
        s.close();
    }
}
