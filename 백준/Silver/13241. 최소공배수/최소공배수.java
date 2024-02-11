import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a*b/gcd(a,b));
        sc.close();
    }
    static long gcd(long a, long b) {
        long ano= a;
        long bno= b;
        long tmp;
        while (b > 0) {
            long r = a % b;
            a = b;
            b = r;

        }
        return a;
    }
}
