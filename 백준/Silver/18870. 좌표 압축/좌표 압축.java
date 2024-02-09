import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 좌표압축
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arrResult = new int[n];

        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap

        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];

        }

        Arrays.sort(arr2); // 정렬먼저함.
        // 정렬 된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for(int v : arr2) {
            /*
             *  이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
             *  중복되면 안되므로, 원소가 중복되지 않을 때만
             *  map에 원소와 그에 대응되는 순위를 넣어준다.
             */
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank); // map에 넣는 이유는 key가 중복이 안되므로
                rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr) {
            int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}