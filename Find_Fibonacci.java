// Write a function to find the nth index number from a given fibonacci series (1, 1, 2, 3, 5, 8,....), where index starts from 1 (1st number is 1, 2nd number is 1, 3rd number is 2 and so on) and print the nth index number. 

// For example, nth number=3 and output=2 because at 3rd position in fibonacci series (1, 1, 2, 3, 5, 8,....), 2 is given. 

import java.util.Scanner;

public class Find_Fibonacci {
    static int Find_nthFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Find_nthFibonacci(n - 1) + Find_nthFibonacci(n - 2);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i == n)
                System.out.println(Find_nthFibonacci(n));
        }
    }
}
