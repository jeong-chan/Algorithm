import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Pair implements Comparable<Pair> {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.value<o.value){
                return -1;
            }else if(this.value>o.value){
                return 1;
            }else{
                if(this.index < o.index){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Pair> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) {
            list.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);
        
        int[] ans = new int[1001];
        for (int i = 0; i < N; i++) {
            ans[list.get(i).index] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
