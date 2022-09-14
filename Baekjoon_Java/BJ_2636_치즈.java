public class Main {

    static int N, M;
    static int[][] map;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static ArrayList <Position> list = new ArrayList<>();
    public static class Position{
        int y, x;

        public Position(int y, int x) {
            this.y = y;
            this.x = x;
        }

    }

    public static class cheeze{
        int cycle, num;

        public cheeze(int cycle, int num) {
            this.cycle = cycle;
            this.num = num;
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
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count =0;
        ArrayList<cheeze> tmp = new ArrayList<>();
        tmp.add(new cheeze(count, count()));

        while(checkmap()) {
            bfs(0, 0);
            changehole();
            count++;
            tmp.add(new cheeze(count, count()));
        }

        System.out.println(tmp.get(tmp.size()-1).cycle);
        System.out.println(tmp.get(tmp.size()-2).num);

    }

    public static void bfs(int starty, int startx){
        Queue<Position> q = new LinkedList<>();
        boolean[][] b_map = new boolean[N][M];
        q.offer(new Position(starty, startx));
        b_map[starty][startx] = true;

        while (!q.isEmpty()){

            Position pos = q.poll();

            for (int i = 0; i < 4; i++) {
                int nexty = pos.y + dy[i];
                int nextx = pos.x + dx[i];

                if(nexty<0 || nextx<0 || nexty>=N || nextx>=M || b_map[nexty][nextx]){
                    continue;
                }
                if(map[nexty][nextx]==1){

                    list.add(new Position(nexty, nextx));
                    continue;
                }
                b_map[nexty][nextx] = true;
                q.offer(new Position(nexty, nextx));


            }
        }
    }

    public static void changehole() {

        for (int i = 0; i < list.size(); i++) {
            map[list.get(i).y][list.get(i).x] = 0;
        }
    }

    public static boolean checkmap(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] != 0)
                    return true;
            }
        }
        return false;
    }

    public static int count(){
        int count =0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}




