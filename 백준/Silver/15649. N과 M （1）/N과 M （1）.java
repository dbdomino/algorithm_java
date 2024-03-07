import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {
        /**
         * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
         * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
         * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.    브루트포스  dfs
         *
         *  문제에서 N과 M이 주어지고, 중복되는 수를 제외한 모든 경우의 수를 탐색하면 된다. 그럼 기본적으로 재귀를 통해 풀어볼 수가 있겠다.
         * 이 때 재귀를 하면서 이미 방문한 노드(값)이라면 다음 노드를 탐색하도록 하기 위해(유망한 노드인지 검사하기 위해)
         * N 크기의 boolean 배열을 생성하고, 탐색과정에서 값을 담을 int 배열 arr 을 생성한다.
         */
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M]; // 탐색과정에서 값을 담을 int 배열 arr 을 생성한다.
        visit = new boolean[N];  // N 크기의 boolean 배열을 생성

        dfs(N, M, 0);
    }
    // dfs 재귀
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}