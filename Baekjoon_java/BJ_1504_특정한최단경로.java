public class Main {

    //정답을 출력하는 변수 ans, 정점의 개수 N, 간선의 개수 E
    static int ans, N, E;
    //인접리스트 graph
    static ArrayList<Position>[] graph;
    //비용을 담기위한 cost
    static int[] cost;
    //방문여부를 체크하기 위한 visited
    static boolean[] visited;
    //최대 비용 1000, 최대 간선의 개수 200000을 곱한 임의의 max값
    static final int MAX = 200000*1000;

    //목적지와 비용을 담는 Position클래스
    public static class Position implements Comparable<Position>{
        //dist: 목적지, cost: 비용
        int dist,cost;

        //생성자
        public Position(int dist, int cost){
            this.dist = dist;
            this.cost = cost;
        }

        //비용이 작은 것이 우선순위가 높음
        @Override
        public int compareTo(Position o){
            return this.cost-o.cost;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //정점의 개수와 간선의 개수 입력
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        //초기화 area
        graph = new ArrayList[N+1];
        cost = new int[N+1];
        visited = new boolean[N+1];

        //그래프 초기화
        for (int i = 0; i < N+1; i++) {
            graph[i] = new ArrayList<>();
        }

        //간선의 개수만큼 반복
        //간선의 정보
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            //a 정점에서
            int a = Integer.parseInt(st.nextToken());
            //b 정점까지의
            int b = Integer.parseInt(st.nextToken());
            //c 비용
            int c = Integer.parseInt(st.nextToken());

            //양방향이므로 그래프에 자리를 바꿔가며 추가
            graph[a].add(new Position(b, c));
            graph[b].add(new Position(a, c));
        }

        st = new StringTokenizer(br.readLine());
        //필수로 들려야하는 정점 1
        int v1 = Integer.parseInt(st.nextToken());
        //필수로 들려야하는 정점 2
        int v2 = Integer.parseInt(st.nextToken());

        //정점 1을 먼저 들린 경우 해답
        int ans1 = 0;
        ans1 += dij(1,v1);
        ans1 += dij(v1,v2);
        ans1 += dij(v2,N);

        //정점 2를 먼저 들린 경우 해답
        int ans2 = 0;
        ans2 += dij(1,v2);
        ans2 += dij(v2,v1);
        ans2 += dij(v1,N);

        //정답은 ans1과 ans2 중 더 작은 값(최소 비용)
        ans = Math.min(ans1,ans2);

        //출력
        //ans1과 ans2이 임의의 max값보다 크다면 경로가 없음
        if(ans1 >= MAX && ans2 >= MAX){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }

    //두 정점간에 최단거리를 구하는 알고리즘
    public static int dij(int start, int end){

        //우선순위 큐 생성
        PriorityQueue<Position> pq = new PriorityQueue<>();
        //visited 배열 초기화
        Arrays.fill(visited, false);
        //cost 배열 초기화(최단거리를 구하므로 최대값으로 초기화함)
        Arrays.fill(cost, MAX);

        //시작지점의 cost는 자기 자신이므로 0
        cost[start] = 0;
        //우선순위큐에 시작점 추가
        //Position(목적지, 목적지까지 비용)
        pq.add(new Position(start, 0));

        while (!pq.isEmpty()){
            //현재 위치
            Position now_pos = pq.poll();

            //현재 위치에서의 목적지가 이미 방문했던 곳이라면
            if(visited[now_pos.dist]){
                continue;
            }

            //방문하지 않았던 곳이라면

            //현재위치의 목적지 방문처리
            visited[now_pos.dist] = true;

            //현재위치의 목적지에서 연결되어 있는 위치 확인
            for (Position next_pos : graph[now_pos.dist]){
                //다음 위치의 목적지의 비용 저장 공간에 있는 값 > 다음 위치의 비용 + 현재위치의 비용
                if(cost[next_pos.dist] > next_pos.cost + now_pos.cost){
                    //값 갱신
                    cost[next_pos.dist] = next_pos.cost + now_pos.cost;
                    //우선 순위 큐에 새로운 포지션 넣음
                    //다음위치에서 정한 목적지, 비용
                    pq.offer(new Position(next_pos.dist, cost[next_pos.dist]));
                }
            }
        }

        //원하는 도착점까지의 비용
        return cost[end];
    }
}
