public class Main {

    static int N;
    static int[] parents;

    public static void makeSet(){
        parents = new int[N+1];
        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }
    }

    public static int findSet(int a){
        if(a == parents[a]) return parents[a];
        return parents[a] = findSet(parents[a]);
    }

    public static void union(int a, int b){
        if(a>b){
            parents[findSet(a)] = findSet(b);
        }else if(b>a){
            parents[findSet(b)] = findSet(a);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        //단위집합 생성
        makeSet();

        //입력을 돌며 연결된 경우 union
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int connection = Integer.parseInt(st.nextToken());
                if(connection == 1) {
                    union(i, j);
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        //여행계획도시 첫번째 도시의 부모 노드 찾기
        int base = findSet(Integer.parseInt(st.nextToken()));
        boolean a = true;

        while(st.hasMoreTokens()){
            //다음 도시의 부모노드 찾기
            int city = Integer.parseInt(st.nextToken());
            //다음 도시의 부모노드가 하나라도 첫 도시의 부모노드와 다르다면
            //fasle;
            if(base != findSet(city)){
                a = false;
                break;
            }
        }

        if(a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
