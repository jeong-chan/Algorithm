public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		long goal;
		
		goal = (V-B)/(A-B) ;
		if((V-B)%(A-B) != 0) { goal++;}
		
		
		
		
		System.out.println(goal);

	}




}
