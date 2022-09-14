public class Main {

    static int N,M,ans_sheep,ans_wolf;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static char[][] map;
    static boolean[][] b_map;

    static class OBJ{
        int y, x;

        public OBJ(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        //맵생성
        map = new char[N][M];
        b_map = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            char[] inputs = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = inputs[j];
                if(map[i][j] == '#'){
                    b_map[i][j] = true;
                }
            }
        }

        //맵을 돌며 울타리가 아니면 bfs로 울타리 안 전부 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(!b_map[i][j]){
                    bfs(i,j);
                }
            }
        }

        System.out.println(ans_sheep+" "+ans_wolf);
    }
    static int sheep;
    static int wolf;
    public static void bfs(int starty, int startx){
        //bfs에서 사용할 queue 생성
        Queue<OBJ> q = new LinkedList<>();
        
        //울타리 내 양과 늑대 초기화
        sheep = 0;
        wolf = 0;

        //시작점에 위치한 양, 늑대에 따라 카운트 증가
        if(map[starty][startx]=='o'){
            sheep += 1;
        }else if(map[starty][startx]=='v'){
            wolf += 1;
        }
        
        //시작점 방문처리
        q.offer(new OBJ(starty,startx));
        b_map[starty][startx] = true;

        while (!q.isEmpty()){
            //현재위치
            OBJ obj = q.poll();

            //탐색위치
            for (int i = 0; i < 4; i++) {
                int nexty = obj.y+dy[i];
                int nextx = obj.x+dx[i];

                //탐색위치가 맵 밖인 경우 continue
                if(nexty<0 || nextx<0 || nexty>=N || nextx>=M || b_map[nexty][nextx]){
                    continue;
                }

                //탐색위치에 양이 있는 경우
                //방문처리
                //큐에 다음위치 넣고
                //양 한 마리 증가
                if(map[nexty][nextx]=='o'){
                    b_map[nexty][nextx] = true;
                    q.offer(new OBJ(nexty,nextx));
                    ++sheep;
                }
                //탐색위치에 늑대가 있는 경우
                //방문처리
                //큐에 다음위치 넣고
                //늑대 한 마리 증가
                else if(map[nexty][nextx]=='v'){
                    b_map[nexty][nextx] = true;
                    q.offer(new OBJ(nexty,nextx));
                    ++wolf;
                }
                //아무것도 없는 경우
                //방문처리
                else{
                    b_map[nexty][nextx] = true;
                    q.offer(new OBJ(nexty,nextx));
                }

            }
        }

        //울타리 탐색이 끝나고
        //울타리 내에 양과 늑대의 수에 따라 ans의 수 증가
        if(sheep>wolf){
            ans_sheep += sheep;
        }else{
            ans_wolf += wolf;
        }
    }
}


