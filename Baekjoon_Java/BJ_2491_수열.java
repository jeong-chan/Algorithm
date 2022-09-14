public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<T; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		int max =1;
		int count_increase= 1;
		for(int i=0; i<T-1; i++) {
			if(list.get(i+1)>=list.get(i)) {
				count_increase++;
			}else {
				max = Math.max(count_increase, max);
				count_increase=1;
			}
		}
		max = Math.max(count_increase, max);
		
		int count_decrease = 1;
		for(int i=0; i<T-1; i++) {
			if(list.get(i+1)<=list.get(i)) {
				count_decrease++;
			}else {
				max = Math.max(count_decrease, max);
				count_decrease=1;
			}
		}
		max = Math.max(count_decrease, max);
		
		System.out.println(max);

	}
}
