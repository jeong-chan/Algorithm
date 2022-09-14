import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if(Integer.parseInt(st.nextToken())==0){
                    count++;
                }
            }

            if(count==1){
                sb.append("A").append("\n");
            }else if(count == 2){
                sb.append("B").append("\n");
            }else if(count == 3){
                sb.append("C").append("\n");
            }else if(count == 4){
                sb.append("D").append("\n");
            }else {
                sb.append("E").append("\n");
            }
        }
        System.out.println(sb);
    }
}
