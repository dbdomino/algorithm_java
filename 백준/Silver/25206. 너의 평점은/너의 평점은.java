import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자..
        // 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum_grade = 0;
        double sum_grade_score = 0;
        for(int i=0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken()); // 학점
            String score = st.nextToken();

            if ("P".equals(score)) continue;


            sum_grade_score += grade*cal(score);
            sum_grade += grade;

        }
        System.out.printf("%.6f",sum_grade_score/sum_grade);


    }
    private static double cal(String score) {
        double ans = 0;
        if ("A+".equals(score)) ans=4.5;
        if ("A0".equals(score)) ans=4.0;
        if ("B+".equals(score)) ans=3.5;
        if ("B0".equals(score)) ans=3.0;
        if ("C+".equals(score)) ans=2.5;
        if ("C0".equals(score)) ans=2.0;
        if ("D+".equals(score)) ans=1.5;
        if ("D0".equals(score)) ans=1.0;
        if ("F".equals(score)) ans=0.0;
        return ans;
    }
}


