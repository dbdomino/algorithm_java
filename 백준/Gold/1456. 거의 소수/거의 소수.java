import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong(); // 최소값
        long max = sc.nextLong(); // 최대값
        primeNumFind f =new primeNumFind(min,max);
        f.find();



        sc.close();
    }
    static class primeNumFind {
        long max;
        long min;
        boolean[] IsNotPrime;
        int[] primeNum;
        //Vector<Integer> a = new Vector<Integer>();
        primeNumFind(long min, long max) {
            this.max = max;
            this.min = min;
        }
        void find() {
            int cntPrime=0;
            primeNum=new int[10000001];// 소수를 넣음
            IsNotPrime = new boolean[10000001]; // 소수가 아닌걸 넣음.

            for (int i = 2; i <10000001; i++) {
                if (IsNotPrime[i]) {
                    i++;
                } else {
                    primeNum[cntPrime++] = i;
                    //a.add(i);
                    for (int j = 2; j <= 10000000; j++) {
                        if (i * j >= 10000000) break;
                        IsNotPrime[i * j] = true;
                    }
                    if (i != 2) i++;
                }
            }

            int cnt = 0;
            for (int k : primeNum) {
                if(k==0) break;
                long n = k;
                while (k <= max / n) {
                    if (k * n >= min) cnt++;
                    n = n * k;
                }
            }
            System.out.print(cnt);
        }
    }
}