// Write a function to check if an entered number exists in fibonacci series or not by using recursion and print 'Yes', if an entered number exist otherwise print 'No'. 

import java.util.Scanner;

public class Number_is_Fibonacci {
    static int isFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return isFibonacci(n - 1) + isFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (isFibonacci(i) == n) {
                flag = true;
                break;
            }
        }
        if (flag == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
