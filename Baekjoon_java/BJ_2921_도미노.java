import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <=number; i++) {
            for (int j = i; j <= i*2; j++) {
                ans += j;
            }
        }

        System.out.println(ans);
    }
}
