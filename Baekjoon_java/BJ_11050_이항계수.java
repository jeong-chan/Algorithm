public class Main {

	static int N,R,count,number[],input[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		number = new int[R];
		input = new int[N];
		for(int i=0; i<N; i++) {
			input[i] = i;
		}
		combi(0,0);
		System.out.println(count);
	}

	public static void combi(int cnt, int start) {
		if(cnt==R) {
			count++;
			return;
		}
		
		for(int i=start; i<N; i++) {
			number[cnt] = input[i];
			combi(cnt+1,i+1);
		}
	}
	
}
