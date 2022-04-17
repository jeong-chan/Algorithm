public class Main {

    static int N, M, count;
    static int map[][];

    static int dy[] = {-1,0,1,0};
    static int dx[] = {0,1,0,-1};
    static ArrayList<Position> viruslist = new ArrayList<>();

    public static class Position{
        int y,x;

        public Position(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(st.nextToken());
                map[i][j] = a;
                if(map[i][j] == 2){
                    viruslist.add(new Position(i,j));
                }
            }
        }


        count = 0;
        walls(0);

        System.out.println(count);

    }

    public static void walls(int numOfwall){
        int tmp[][] = new int[N][M];
        if(numOfwall == 3){
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    tmp[i][j] = map[i][j];
                }
            }

            count = Math.max(count, bfs(tmp));
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0){
                    map[i][j] = 1;
                    walls(numOfwall+1);
                    map[i][j] = 0;
                }
            }
        }

    }

    public static int bfs(int[][] map){
        Queue<Position> q = new LinkedList<>();
        boolean b_map[][] = new boolean[N][M];
        for (int i = 0; i < viruslist.size(); i++) {
            q.offer(new Position(viruslist.get(i).y,viruslist.get(i).x));
            b_map[viruslist.get(i).y][viruslist.get(i).x] = true;
        }

        while(!q.isEmpty()){

            Position now = q.poll();

            for (int i = 0; i < 4; i++) {

                int ny = now.y+dy[i];
                int nx = now.x+dx[i];

                if(ny<0 || nx<0 || ny>=N || nx>=M || b_map[ny][nx] || map[ny][nx] == 1){
                    continue;
                }
                q.offer(new Position(ny,nx));
                b_map[ny][nx] = true;
            }
        }

        return count_true(b_map);
    }

    public static int count_true(boolean[][] b_map){
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] != 1 && !b_map[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
}
