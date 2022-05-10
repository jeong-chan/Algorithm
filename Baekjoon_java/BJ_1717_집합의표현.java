public class Main {

    static int parents[];

    //부모 노드 찾기
    public static int findSet(int a){
        if(a == parents[a]){
            return parents[a];
        }else{
            return parents[a] = findSet(parents[a]);
        }
    }

    //합집합 연산
    public static void union(int a, int b){

        //부모노드가 서로 같다면 수행하지 않음
        int rootA= findSet(a);
        int rootB= findSet(b);
        if(rootA==rootB) return;

        //부모노드가 다르다면
        //작은 숫자가 부모노드가 되도록 수행
        if(a>b){
            parents[findSet(a)] = findSet(b);
        }else if(b>a){
            parents[findSet(b)] = findSet(a);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //집합 생성
        parents = new int[N+1];
        for (int i = 1; i <=N; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            int command=  Integer.parseInt(st.nextToken());
            int number_a = Integer.parseInt(st.nextToken());
            int number_b = Integer.parseInt(st.nextToken());

            //합집합 command 입력시
            if(command == 0){
                union(number_a,number_b);
            }
            //동일집합여부 command 입력시
            else{
                if(findSet(number_a) == findSet(number_b)){
                    sb.append("YES").append("\n");
                }else{
                    sb.append("NO").append("\n");
                }
            }

        }

        System.out.println(sb);
    }
}
