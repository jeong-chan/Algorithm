public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] map = new int[100][100];

		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					map[y+j][x+k] =1;
				}
			}

		}
		int count =0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(map[i][j]==1)count++;
			}
		}

		System.out.println(count);


	}
}
