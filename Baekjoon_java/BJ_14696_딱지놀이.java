public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();

		for(int i =0; i<N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int num_a = Integer.parseInt(st.nextToken());

			int a[] = new int[5];
			
			for( int j=0; j<num_a; j++) {
				a[Integer.parseInt(st.nextToken())]++;
			}
			st = new StringTokenizer(br.readLine());

			int num_b = Integer.parseInt(st.nextToken());
			int b[] = new int[5];
			
			for( int j=0; j<num_b; j++) {
				b[Integer.parseInt(st.nextToken())]++;
			}

			for( int j=4; j>0; j--) {
				if(Arrays.equals(a, b)) {
					sb.append("D").append("\n");
					break;
				}
				if(a[j]>b[j]) {
					sb.append("A").append("\n");
					break;
				}else if(b[j]>a[j]) {
					sb.append("B").append("\n");
					break;
				}else {
					continue;
				}
			}
			
				
		}
		System.out.println(sb);

	}
}
