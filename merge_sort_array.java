// Write a program to merge a two sets of  list.and display the final output after sorting a final list. The output format should be required as [n1, n2, n3, n4,....]. 

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class merge_sort_array {
    public static <T> Set<T> merge_arr(Set<T> a, Set<T> b) {
        Set<T> merged = new TreeSet<>();
        merged.addAll(a);
        merged.addAll(b);
        return merged;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> arr1 = new HashSet<Integer>();
        int n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            arr1.add(scan.nextInt());
        }

        Set<Integer> arr2 = new HashSet<Integer>();
        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            arr2.add(scan.nextInt());
        }

        System.out.println(merge_arr(arr1, arr2));
    }
}
