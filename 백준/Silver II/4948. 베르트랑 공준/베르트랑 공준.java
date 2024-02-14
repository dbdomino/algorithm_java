import java.util.Scanner;

public class Main {
    /*
	1<=n <= 123456 이므로 2n 은 최대 246912 이다.
	0 부터 시작하므로 246912 + 1
	*/
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) {
        // 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
        //  에라토스테네스의 체 이용
        // 제곱한것으로 소수인걸 false로하면서 false를 찾도록 하는=소수를 찾는것
        Scanner in = new Scanner(System.in);

        get_prime2();	// 소수를 얻는 메소드 실행

        while(true) {
            int n = in.nextInt();
            if(n == 0) break;	// n 이 0 일경우 종료

            int count = 0;	// 소수 개수를 셀 변수
            // 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
            for(int i = n+1; i <= 2*n; i++) {
                if(!prime[i]) count++; // false일때 = 소수일때 count ++
            }
            System.out.println(count);
        }
    }
    public static void get_prime2() {
        // 0 과 1 은 소수가 아니므로 ture
        prime[0] = prime[1] = true;

        for(int i = 2; i*i < prime.length; i++) {
            if(prime[i]) continue; // 소수아닌걸로 판정된 것은 true이므로 다음으로 넘김
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true; // 소수가 아닌것은 true로 시킴.
            }
        }
        // 소수가 마지막에 false로 전부 남을 것이다.
    }
}
