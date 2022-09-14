public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        if(N == 1){
            System.out.println(1);
            return;
        }

        while(true){
            queue.poll();
            if(queue.size() ==1){
                break;
            }
            queue.offer(queue.poll());
        }

        System.out.println(queue.peek());
    }


}
