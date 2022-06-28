import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            String command = st.nextToken();
            long b = Long.parseLong(st.nextToken());
            String equal = st.nextToken();
            long c = Long.parseLong(st.nextToken());

            long ans = 0;
            if(command.equals("+")){
                ans = a+b;
            }else if(command.equals("-")){
                ans = a-b;
            }else if(command.equals("*")){
                ans = a*b;
            }else if(command.equals("/")){
                ans = a/b;
            }

            if(ans == c){
                sb.append("correct").append("\n");
            }else{
                sb.append("wrong answer").append("\n");
            }
        }
        System.out.println(sb);
    }

}
