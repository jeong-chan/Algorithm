public class Main {
	
	
	static int need,N,lan[],count;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		need = Integer.parseInt(st.nextToken());
		
		lan = new int[N];
		for(int i=0; i<N; i++) {
			lan[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(lan);
		long mid=0;
		long start=1;
		long end=lan[N-1];
		
		while(start<=end) {
			
			mid = (start+end)/2;
			count=0;
			
			for(int i=0; i<N; i++) {
				count += lan[i]/mid; 
			}
			
			if(count<need) {
				end = mid-1;
			}
			
			else if(count>=need) {
				start = mid+1;
			}
			
		}
		
		System.out.println(end);
	}

		
	
}
