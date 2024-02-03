import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int n=0; // n은 카운트긴한데 구간을 나타냄
        int top=1;
        int bot=1;
        int cnt=0; // cnt는 해당구간에서 총 몇
        if(x==1) {
            System.out.println("1/1");
        }else {
            while(cnt<x){
                n++;
                cnt=n*(n+1)/2; // 1부터 n까지의 합 = n*(n+1)/2
            }
            int num=x-(n-1)*n/2;  //행의 몇번 째 값인지 찾는 코드, 1부터 n-1까지의 합을 구해서 빼면 순서나옴
            if(n%2==0) {  //짝수 행일 시
                top=num;
                bot=n-num+1;
            }else {
                top=n-num+1;
                bot=num;
            }
            System.out.println(top+"/"+bot);
        }

    }
}
