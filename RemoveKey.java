// Write a program to remove an entry of entered key name from a key-value pair and print the remaining key-value pair. The output format should be required as  {2: 66, 3: 45} 

import java.util.HashMap;
import java.util.Scanner;

public class RemoveKey {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        int key[] = new int[n];
        int value[] = new int[n];
        for (int i = 0; i < n; i++)
            key[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
            hmap.put(key[i], value[i]);
        }
        Integer keyToBeRemoved = in.nextInt();

        hmap.remove(keyToBeRemoved);
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            if (hmap.get(key[i]) != null && i != n - 1)
                System.out.print(key[i] + ": " + hmap.get(key[i]) + ", ");
            else if (hmap.get(key[i]) != null && i == n - 1)
                System.out.print(key[i] + ": " + hmap.get(key[i]));
        }
        System.out.print("}");
    }
}
