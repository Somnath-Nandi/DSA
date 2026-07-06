// Write a program to check an entered number is even or odd and print EVEN, if an entered number is even otherwise print ODD using recursion. 

import java.util.Scanner;

public class Is_Even_or_Odd {
    static int isEvenorOdd(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 0;
        else
            return isEvenorOdd(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        if (isEvenorOdd(Math.abs(n)) == 1)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
