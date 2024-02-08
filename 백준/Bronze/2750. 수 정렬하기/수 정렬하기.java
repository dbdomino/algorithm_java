import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// N개의 수가 주어졌을 때, 이를 오름차순
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}