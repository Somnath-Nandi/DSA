import java.util.Scanner;

public class sunday_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        int n = sc.nextInt();
        String days[] = { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
        int i;
        for (i = 0; i < days.length; i++)
            if (days[i].equals(start))
                break;
        int res = 1;
        int rem = 6 - i;
        n = n - rem;
        if (n > 0)
            res += n / 7;
        System.out.println(res);
    }
}
