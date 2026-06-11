import java.util.Scanner;

public class chocolate_factory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int chocolate[] = new int[N];
        for(int i=0;i<N;i++) {
            chocolate[i] = sc.nextInt();
        }
        int a[] = new int[N];
        int a_count = 0;
        for(int i=0;i<N;i++) {
            if(chocolate[i]!=0) {
                a[a_count++] = chocolate[i];
            }
        }
        for(int i=0;i<N;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
