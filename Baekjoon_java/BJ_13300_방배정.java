public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int total_num = Integer.parseInt(st.nextToken());
		int room_max = Integer.parseInt(st.nextToken());
		
		int[] g_stu = new int[6];
		int[] b_stu = new int[6];
		
		for(int i=0; i<total_num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			if(gender == 1) {
				b_stu[grade-1]++;
			}else {
				g_stu[grade-1]++;
			}
		}
		
		int count =0;
		
		for(int i=0; i<6; i++) {
			if(b_stu[i]%room_max == 0) {
				count += b_stu[i]/room_max;
			}else if(b_stu[i]%room_max != 0) {
				count += (b_stu[i]/room_max)+1;
			}
			if(g_stu[i]%room_max == 0) {
				count += g_stu[i]/room_max;
			}else if(g_stu[i]%room_max != 0) {
				count += (g_stu[i]/room_max)+1;
			}
		}
		
		System.out.println(count);
		
	}
	
}
