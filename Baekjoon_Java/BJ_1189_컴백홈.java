public class Main {

    static int N,M,K,ans;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static char[][] map;
    static boolean[][] b_map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        //입력되는 맵과 방문처리를 할 맵
        map = new char[N][M];
        b_map = new boolean[N][M];

        //맵 입력, T있는 자리는 지나가지 못하도록 true처리
        for (int i = 0; i < N; i++) {
            char[] inputs = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = inputs[j];
                if(map[i][j] == 'T'){
                    b_map[i][j] = true;
                }
            }
        }
        //시작위치는 방문처리, count는 1부터 시작
        b_map[N-1][0] = true;
        dfs(N-1,0,1);
        
        //정답출력
        System.out.println(ans);
    }

    public static void dfs(int starty, int startx, int count){

        //목적지에 도달한 경우
        if(starty == 0 && startx == M-1){
            //count가 K와 같으면 정답 +1
            if(count == K){
                ans++;
            }
            return;
        }

        //4방향 탐색
        for (int i = 0; i < 4; i++) {
            int ny = starty+dy[i];
            int nx = startx+dx[i];

            //갈수있는 위치라면 진행
            if(ny >=0 && nx >=0 && ny<N && nx<M && !b_map[ny][nx]){
                b_map[ny][nx] = true;
                dfs(ny,nx,count+1);
                //백트래킹
                b_map[ny][nx] = false;
            }
        }
    }
}


