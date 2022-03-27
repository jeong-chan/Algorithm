public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num_fruits = Integer.parseInt(br.readLine());	
		int dir[] = new int[6];
		int len[] = new int[6];
		for(int i=0; i<6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			dir[i] = Integer.parseInt(st.nextToken());
			len[i] = Integer.parseInt(st.nextToken());
		}


		int tmp_max_x=0;
		int tmp_max_y=0;
		int tmp_max_index_x=0;
		int tmp_max_index_y=0;

		for(int i=0; i<6; i++) {

			if(dir[i]==2 || dir[i]==1) {
				if(len[i]>=tmp_max_x) {
					tmp_max_index_x = i;
					tmp_max_x = len[i];
				}
			}if(dir[i]==3 || dir[i]==4) {
				if(len[i]>=tmp_max_y) {
					tmp_max_index_y = i;
					tmp_max_y = len[i];
				}
			}

		}
		int min_y =0;
		int min_x =0;
		for(int i=0; i<6; i++) {

			if(tmp_max_index_x==0) {
				min_y = Math.abs(len[5]-len[1]);
			}else if(tmp_max_index_x == 5) {
				min_y = Math.abs(len[0]-len[4]);
			}else {
				min_y = Math.abs(len[tmp_max_index_x-1]-len[tmp_max_index_x+1]);				
			}
			if(tmp_max_index_y==0) {
				min_x = Math.abs(len[5]-len[1]);
			}else if(tmp_max_index_y==5) {
				min_x = Math.abs(len[0]-len[4]);

			}else {
				min_x = Math.abs(len[tmp_max_index_y-1]-len[tmp_max_index_y+1]);
			}
		}
		int sum;
		sum = tmp_max_x*tmp_max_y - min_y*min_x;
		System.out.println(sum*num_fruits);

	}
}
