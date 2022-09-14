public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        int count = 1;
        while (q.size()!=1) {

            if(count == K){
                count = 1;
                sb.append(q.poll()).append(", ");
                continue;
            }

            ++count;
            q.offer(q.poll());
        }

        if(K%2 != 0){
            sb.append(q.poll()).append(">");
        }else {
            q.offer(q.poll());
            sb.append(q.poll()).append(">");
            //sb.append(q.poll()).append(">");
        }System.out.println(sb);
    }

}
