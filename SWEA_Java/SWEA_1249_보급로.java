public class Solution {

    static int size;
    static int[][] map;
    static int[][] dij;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};

    public static class Position implements Comparable<Position>{
        int y,x;
        int val;

        public Position(int y, int x, int val) {
            this.y = y;
            this.x = x;
            this.val = val;
        }

        @Override
        public int compareTo(Position o) {
            return this.val-o.val;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= TC; tc++) {
            size = Integer.parseInt(br.readLine());
            map = new int[size][size];
            dij = new int[size][size];

            for (int i = 0; i < size; i++) {
                String[] arr = br.readLine().split("");
                for (int j = 0; j < size; j++) {
                    map[i][j] = Integer.parseInt(arr[j]);
                    dij[i][j] = Integer.MAX_VALUE;
                }
            }

            int answer = dij(new Position(0,0,map[0][0]));
            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);

    }

    public static int dij(Position positon){
        PriorityQueue<Position> pq = new PriorityQueue<>();
        pq.offer(new Position(positon.y, positon.x, positon.val));
        boolean[][] b_map = new boolean[size][size];
        b_map[0][0] = true;
        dij[positon.y][positon.x] = map[positon.y][positon.x];

        while(!pq.isEmpty()){
            Position now = pq.poll();

            for (int i = 0; i < 4; i++) {
                int ny = now.y+dy[i];
                int nx = now.x+dx[i];

                if(ny<0 || nx<0 || ny>=size || nx>=size || b_map[ny][nx]){
                    continue;
                }

                if(dij[ny][nx] > dij[now.y][now.x]+map[ny][nx]){
                    dij[ny][nx] = dij[now.y][now.x]+map[ny][nx];
                    pq.offer(new Position(ny,nx,dij[ny][nx]));
                    b_map[ny][nx] = true;
                }
            }
        }

        return dij[size-1][size-1];
    }

}
