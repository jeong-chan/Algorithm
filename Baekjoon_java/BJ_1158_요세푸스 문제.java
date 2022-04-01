public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int origin = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<>();
		for(int i=1; i<=origin; i++) {
			que.offer(i);
		}
		
		int count = 1;
		int tmp = 0;
		sb.append("<");
		while(!que.isEmpty()) {
			
				if(count%cycle ==0) {
					sb.append(que.poll()+", ");
				}else {
					tmp = que.poll();
					que.offer(tmp);
			}
		count++;
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		
		System.out.println(sb);
	}

}
