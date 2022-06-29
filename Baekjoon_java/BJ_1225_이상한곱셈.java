import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] first = st.nextToken().split("");
        if(first[0].equals("0")){
            System.out.println(0);
            return;
        }
        String[] second = st.nextToken().split("");

        long ans = 0;
        for (int i = 0; i < first.length; i++) {
            int number = Integer.parseInt(first[i]);
            for (int j = 0; j < second.length; j++) {
                int second_number = Integer.parseInt(second[j]);
               // System.out.println(number+" * "+second_number);
                ans += number*second_number;
            }
        }

        System.out.println(ans);
    }

}
