import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());

        int jiminteam = 0;
        int hansuteam = 0;

        if(jimin%2 == 1){
            jiminteam = (jimin+1)/2;
        }else {
            jiminteam = jimin/2;
        }

        if(hansu%2 == 1){
            hansuteam = (hansu+1)/2;
        }else{
            hansuteam = hansu/2;
        }

        int count = 1;
        while(true){
            if( jiminteam == hansuteam){
                System.out.println(count);
                break;
            }else{

                if(jiminteam%2 == 1){
                    jiminteam = (jiminteam+1)/2;
                }else {
                    jiminteam = jiminteam/2;
                }

                if(hansuteam%2 == 1){
                    hansuteam = (hansuteam+1)/2;
                }else{
                    hansuteam = hansuteam/2;
                }

            }

            count++;

        }
    }

}
