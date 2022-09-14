public class Main {

    public static class Position implements Comparable<Position>{
        int y,x;

        public Position(int x, int y) {
            this.y = y;
            this.x = x;
        }

        @Override
        public int compareTo(Position o) {
            if(this.y == o.y) return this.x-o.x;
            return this.y-o.y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Position> pq = new PriorityQueue<>();
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.offer(new Position(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        for (int i = 0; i < a; i++) {
            Position tmp = pq.poll();
            sb.append(tmp.x).append(" ").append(tmp.y).append("\n");
        }

        System.out.println(sb);
    }
}
