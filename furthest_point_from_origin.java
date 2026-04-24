import java.util.*;

class Solution {
    public static int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int left_ctr = 0, right_ctr = 0;
        for(int i=0;i<n;i++) {
            char ch = moves.charAt(i);
            if (ch=='L')
                left_ctr++;
            else if(ch=='R')
                right_ctr++;
        }
        for(int i=0;i<n;i++) {
            char ch = moves.charAt(i);
            if (ch=='_'&&left_ctr>=right_ctr)
                left_ctr++;
            else if (ch=='_'&&left_ctr<right_ctr)
                right_ctr++;
        }
        return(Math.abs(left_ctr-right_ctr));    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String consisting of L, R and _:");
        String moves = sc.next();
        System.out.println("Furthest Point from Origin: "+furthestDistanceFromOrigin(moves.toUpperCase()));
    }
}