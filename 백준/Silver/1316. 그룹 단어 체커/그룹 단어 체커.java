import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우
        // 한 단어라도 떨어져서 나타나면 그룹 단어가 아니다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        // 각 문자열을 분해해서 철자가 연속으로 사용되는지 확인
        // 연속사용 끝난 철자가 이후에도 사용되는지 확인

        for(int i = 0; i<n; i++){
            String s = sc.next();
            if(check(s)) cnt++;
        }
        System.out.println(cnt);

        sc.close();

    }

    public static boolean check(String str) {
        boolean[] check = new boolean[26]; // 모든 철자가 연속적으로 한번씩만 나와야되므로 나온유무 넣기위해 사용
        int prev = 0; // 이전 값이 중요..

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)

            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if (!check[now - 'a']) { //   check[now - 'a'] == false
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }
            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            // else 문은 없어도 됨
            else {
                continue;
            }
        }
        return true;
    }
}
