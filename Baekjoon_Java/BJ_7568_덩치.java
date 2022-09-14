public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> height = new ArrayList<Integer>();
		ArrayList<Integer> weight = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			height.add(Integer.parseInt(st.nextToken()));
			weight.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<num; i++) {
			int count = 1;
			for(int j=0; j<num; j++) {
				if(height.get(i) < height.get(j) && weight.get(i) < weight.get(j)) {
					count++;
				}
			}
			sb.append(count).append(" ");
		}
		
		System.out.println(sb.toString());
	}
		
}
