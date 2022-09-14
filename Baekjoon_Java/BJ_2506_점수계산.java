import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int point = 1;
        for (int i = 0; i < count; i++) {
            if(Integer.parseInt(st.nextToken()) == 0){
                point = 1;
            }else{
                ans += point;
                point++;            }
        }
        System.out.println(ans);
    }
}
