// Write a program to validate an entered file extension and print 'true' , if validate otherwise print 'false'. 

// Note: The program should accept  txt, doc, csv and pdf file extensions only. 

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileExtenValidation {
    public static boolean validateFileExtn(String fname) {
        int index = fname.indexOf('.');
        String ext = fname.substring(index + 1, fname.length());
        Pattern pattern = Pattern.compile("txt|doc|csv|pdf");
        Matcher matcher = pattern.matcher(ext);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        String fileName = s.nextLine();
        System.out.println(validateFileExtn(fileName));

    }
}
