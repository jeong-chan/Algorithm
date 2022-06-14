import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] base = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            base[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(base);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = base.length-1;
            boolean flag = false;
            while(left <= right){
                int mid = (left+right)/2;
                int midval = base[mid];
                if(midval> num){
                    right = mid-1;
                }else if( midval < num){
                    left = mid+1;
                }else{
                    flag = true;
                    sb.append(1).append("\n");
                    break;
                }
            }
            if(!flag){
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }

}
