// Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

// Note: The array consists of only positive and negative integers and not zero.

public class First_Non_Repeating_Element {
    public static int firstNonRepeating(int[] arr) {
        int N = arr.length;
        for(int i = 0; i<N;i++) {
            boolean flag = false;
            for(int j=0;j<N;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return arr[i];
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        System.out.println(firstNonRepeating(arr));
    }
}
