import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int x_axis[] = new int[3]; //x 좌표 3개 입력받아서 저장할 배열, 셋중 다른 하나를 찾아야함.
        int y_axis[] = new int[3]; //y 좌표 3개 입력받아서 저장할 배열

        for(int i = 0; i < 3; i++) { 
            st = new StringTokenizer(br.readLine());
            x_axis[i] = Integer.parseInt(st.nextToken()); //앞은 x좌표
            y_axis[i] = Integer.parseInt(st.nextToken()); //뒤는 y좌표
        }

        br.close(); 

        int x = 0; 
        int y = 0; 

        if(x_axis[0] == x_axis[1]){ 
            x = x_axis[2]; 
        }else{ 
            x = (x_axis[0] == x_axis[2]) ? (x_axis[1]) : (x_axis[0]);
        }

        if(y_axis[0] == y_axis[1]){
            y = y_axis[2];
        }else{
            y = (y_axis[0] == y_axis[2]) ? (y_axis[1]) : (y_axis[0]);
        }

        bw.write(x + " " + y);
        bw.flush();
        bw.close();

    }
}