public class Main {

	//	static int[][] tmp_map;
	static int N,M,R,r,c,s;
	static int[] dx= {1,0,-1,0};
	static int[] dy= {0,1,0,-1};
	static ArrayList<int[]> order= new ArrayList<>();
	static boolean[] isSelected;
	static int[][] abc;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		isSelected =new boolean[R];


		int[][] arr = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int value = Integer.parseInt(st.nextToken());
				arr[i][j] = value;
			}
		}
		int[][] arr_tmp = new int[N][M];
		

		abc = new int[R][3];

		for(int i=0; i<R; i++) {
			st = new StringTokenizer(br.readLine());
			abc[i][0] = Integer.parseInt(st.nextToken());
			abc[i][1] = Integer.parseInt(st.nextToken());
			abc[i][2] = Integer.parseInt(st.nextToken());

		}

		permutation(0,new int[R]);
		
		
		int min = Integer.MAX_VALUE;
		int tmp[];
		for(int i=0; i<order.size(); i++) {

			tmp = order.get(i);
			for(int k=0; k<N; k++) {
				System.arraycopy(arr[k], 0, arr_tmp[k], 0, M);
			}
	
			
			for(int j =0; j<tmp.length; j++) {
				
				r =abc[tmp[j]][0];
				c =abc[tmp[j]][1];
				s =abc[tmp[j]][2];
				arr_tmp = calc(arr_tmp,r,c,s);
	
			}
			
			for(int q=0; q<N; q++) {
				int sum =0;
				for(int j=0; j<M; j++) {
					sum += arr_tmp[q][j];
				}
				min = Math.min(min, sum);
			}
			
			
		}

		sb.append(min);
		System.out.println(sb);

	}

	public static void permutation(int cnt, int[] i_value) {

		if(cnt==R) {
			int[]a=new int[R];
			System.arraycopy(i_value, 0, a, 0, R);
			order.add(a);
	
			
			return;

		}

		for(int i=0; i<R; i++) {
			if(isSelected[i]) {
				continue;
			}
			isSelected[i] = true;
			i_value[cnt] = i;
			permutation(cnt+1,i_value);
			isSelected[i] = false;

		}



	}


	public static int[][] calc(int[][] arr, int r, int c, int s) {
		
		for(int i=0; i<s; i++) {

			int square_le = 2*s;
			int start_y = r-s-1+i;
			int start_x = c-s-1+i;


			int a1=arr[start_y][start_x];
			int a2=arr[start_y][start_x];

			for(int j=0+i; j<square_le-i; j++) {

				if(j%2==0) {
					a1 =arr[start_y][start_x+1];
					arr[start_y][start_x+1] = a2;
				}else {
					a2 =arr[start_y][start_x+1];
					arr[start_y][start_x+1] = a1;
				}
				start_x++;

			}
			for(int j=0+i; j<square_le-i; j++) {

				if(j%2==0) {
					a1=arr[start_y+1][start_x];
					arr[start_y+1][start_x] = a2;
				}else {
					a2 =arr[start_y+1][start_x];
					arr[start_y+1][start_x] = a1;
				}
				start_y++;


			}
			for(int j=0+i; j<square_le-i; j++) {

				if(j%2==0) {
					a1=arr[start_y][start_x-1];
					arr[start_y][start_x-1] = a2;
				}else {
					a2 =arr[start_y][start_x-1];
					arr[start_y][start_x-1] = a1;
				}
				start_x--;


			}
			for(int j=0+i; j<square_le-i; j++) {

				if(j%2==0) {
					a1=arr[start_y-1][start_x];
					arr[start_y-1][start_x] = a2;
				}else {
					a2 =arr[start_y-1][start_x];
					arr[start_y-1][start_x] = a1;
				}
				start_y--;

			}
		}




		return arr;

	}


}
