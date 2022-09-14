import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cycle = Integer.parseInt(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int E = Integer.parseInt(br.readLine());

            int ans = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < E; j++) {
                ans += Integer.parseInt(st.nextToken());
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
