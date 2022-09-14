public class Main {

    //최소 스패닝 트리에서 모든 간선의 가중치가 전부 1로 동일할 경우
    //최소 스패닝 트리를 이루는 간선의 갯수는 무조건 노드의 개수 -1 이다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int j = 0; j < M; j++) {
                br.readLine();
            }
            sb.append(N-1).append("\n");
        }
        System.out.println(sb);
    }
}
