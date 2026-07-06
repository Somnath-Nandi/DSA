// Write a program to check a number can be expressed as a sum of consecutive numbers or not and print 'Yes', if number can be expressed otherwise print 'No'. 

// For example, input n=10 and output=Yes because it can be expressed as a sum of consecutive numbers like 1+2+3+4=10. 

import java.util.Scanner;

public class Can_Be_Sum_of_Consecutive {
    static boolean canBeSumofConsec(int n) {

        boolean flag = false;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n)
                    return true;
                if (sum > n)
                    break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(canBeSumofConsec(n) ? "Yes" : "No");
    }
}
