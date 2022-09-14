import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M<=N){
            if(M == 1 || M == 2){
                System.out.println("NEWBIE!");
            }else{
                System.out.println("OLDBIE!");
            }
        }else{
            System.out.println("TLE!");
        }
    }

}
