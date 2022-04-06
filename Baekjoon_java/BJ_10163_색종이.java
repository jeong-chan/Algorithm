public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map = new int[1001][1001];
		int numOfpaper = Integer.parseInt(br.readLine());
		int[] area_count = new int[numOfpaper+1];

		for(int i=1; i<=numOfpaper; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int first_x = Integer.parseInt(st.nextToken());
			int first_y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			for(int j = 1; j<=h; j++) {
				for(int k = 1; k<=w; k++) {
					map[first_y+j-1][first_x+k-1] = i;
				}
			}

		}
		
		for(int i=0; i<1001; i++) {
			for(int j=0; j<1001; j++) {
				if(map[i][j]!=0) {
					area_count[map[i][j]]++;
				}
			}
		}

		for(int i=1; i<area_count.length; i++) {
			System.out.println(area_count[i]);
		}


	}
}








