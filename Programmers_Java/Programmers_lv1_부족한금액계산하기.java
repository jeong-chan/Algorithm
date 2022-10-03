import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Programmers_lv1_부족한금액계산하기 {

    public long solution(int price, int money, int count) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        long answer = money;
        for(int i=1; i<=count; i++){
            answer -= (long) price*i;
        }
        if(answer >= 0 ){
            return 0;
        }

        return (long) Math.abs(answer);
    }
}
