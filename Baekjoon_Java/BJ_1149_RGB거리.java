public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int house = Integer.parseInt(br.readLine());
		int[][] houses = new int[house+1][3];
		
		for(int i=1; i<=house; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				houses[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=house; i++) {
			houses[i][0] += Math.min(houses[i-1][1], houses[i-1][2]);
			houses[i][1] += Math.min(houses[i-1][0], houses[i-1][2]);
			houses[i][2] += Math.min(houses[i-1][0], houses[i-1][1]);
		}
		
		int result = Math.min(Math.min(houses[house][0], houses[house][1]), houses[house][2]);
		
		System.out.println(result);
	}
}
