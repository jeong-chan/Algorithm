public class Main {

    //대각선도 포함이므로 8방탐색
    static int[] dy = {-1,-1,0,1,1,1,0,-1};
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int N,M;
    static boolean[][] b_map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            if(N == 0 && M ==0){
                break;
            }
            //맵입력
            int[][] map = new int[N][M];
            b_map = new boolean[N][M];
            int ans = 0;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if(map[i][j]==0){
                        b_map[i][j] = true;
                    }
                }
            }

            //육지(1)을 발견하면 dfs탐색, 탐색이 끝나면 ans 1증가
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(!b_map[i][j]){
                        ans++;
                        dfs(i,j);
                    }
                }
            }

            sb.append(ans).append("\n");

        }
        System.out.println(sb);
    }

    public static void dfs(int y, int x){

        //8방향을 회전하며 육지를 이동
        for (int k = 0; k < 8; k++) {

            int ny = y+dy[k];
            int nx = x+dx[k];

            //지나온 자리는 다시 돌아가지 않도록 ture처리
            if(ny>=0 && nx>=0 && ny<N && nx< M && !b_map[ny][nx]){
                b_map[ny][nx]= true;
                dfs(ny, nx);
            }

        }

    }

}


