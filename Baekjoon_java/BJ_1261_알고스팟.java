public class Main {

    static int N,M;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static int[][] map;
    static int[][] dijk;

    static class Position implements Comparable<Position>{
        int y, x, val;

        public Position(int y, int x, int val) {
            this.y = y;
            this.x = x;
            this.val = val;
        }

        @Override
        public int compareTo(Position o) {
            return this.val - o.val;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //map 사이즈
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        //맵 선언
        map = new int[N][M];
        //맵의 위치 당 최소 가중치를 표기하는 2차원 배열
        dijk = new int[N][M];

        //값 입력
        for (int i = 0; i < N; ++i) {
            String arr[] = br.readLine().split("");
            for (int j = 0; j < M; ++j) {
                //맵입력
                map[i][j] = Integer.parseInt(arr[j]);
                //최소 가중치를 비교하기위해 MAX값 삽입
                dijk[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.println(dij(0,0));
    }

    //최소값을 구하는 dijkstra 알고리즘
    public static int dij(int starty, int startx){
        //우선순위 큐 사용
        PriorityQueue<Position> pq = new PriorityQueue<>();
        // 방문체크를 위한 배열선언
        boolean b_map[][] = new boolean[N][M];
        //초기 값 삽입
        pq.offer(new Position(starty, startx, map[starty][startx]));
        //처음위치 방문체크
        b_map[starty][startx] = true;
        //최소값 2차원 배열에 처음위치 = map의 처음위치
        dijk[starty][startx] = map[starty][startx];

        while(!pq.isEmpty()){
            Position pos = pq.poll();

            for (int i = 0; i < 4; i++) {
                //다음위치
                int nexty = pos.y + dy[i];
                int nextx = pos.x + dx[i];

                //다음 위치가 맵 안에 있고
                if(nextx>=0 && nexty >=0 && nexty<N && nextx<M){
                    //다음위치의 최소값(초기 값은 Integer.MAXVALUE로 초기화되어있음)이 이전 최소값 + map의 위치 값 보다 크면
                    if(dijk[nexty][nextx] > dijk[pos.y][pos.x] + map[nexty][nextx]){
                        //값 갱신
                        dijk[nexty][nextx] = dijk[pos.y][pos.x] + map[nexty][nextx];
                        //q에 넣기
                        pq.offer(new Position(nexty, nextx, dijk[nexty][nextx]));
                        //방문체크
                        b_map[nexty][nextx] = true;
                    }
                }
            }
        }
        //최종 위치 값 리턴
        return dijk[N-1][M-1];
    }

}





