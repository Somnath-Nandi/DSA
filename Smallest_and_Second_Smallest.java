public class Smallest_and_Second_Smallest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6 };
        int N = arr.length;
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] < sec_min && arr[i] > min) {
                sec_min = arr[i];
            }
        }

        System.out.print(min + " " + sec_min);
    }
}
