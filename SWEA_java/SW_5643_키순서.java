public class Solution {

    static final int INF = 999;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= TC; tc++) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            int map[][] = new int[N + 1][M + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if(i==j){
                        map[i][j] =0;
                    }else{
                        map[i][j] = INF;
                    }
                }
            }

            for (int j = 0; j <M ; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                map[start][end] = 1;
            }


            for (int i = 1; i <=N ; i++) {
                for (int j = 1; j <=N ; j++) {
                    for (int k = 1; k <=N ; k++) {
                        map[j][k] = Math.min(map[j][k], map[j][i]+map[i][k]);
                    }
                }
            }

            int count = 0;
            for (int i = 1; i <= N; i++) {
                boolean flag = true;
                for (int j = 1; j <= N; j++) {
                    if(i !=j && map[i][j] == INF &&  map[j][i] == INF){
                        flag = false;
                        break;
                    }
                }
                if(flag) count++;
            }

            sb.append("#").append(tc).append(" ").append(count).append("\n");

        }
        System.out.println(sb);
    }
}
