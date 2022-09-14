public class Main {

	static int dy[] = {-2,-2,0,0,2,2};
	static int dx[] = {-1,1,-2,+2,-1,+1};
	static int N,ans;
	static int map[][];
	static class Position{
		int y, x, cnt;

		public Position(int y, int x, int cnt) {
			super();
			this.y = y;
			this.x = x;
			this.cnt = cnt;
		}

		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start_r = Integer.parseInt(st.nextToken());
		int start_c = Integer.parseInt(st.nextToken());
		int end_r = Integer.parseInt(st.nextToken());
		int end_c = Integer.parseInt(st.nextToken());
		
		bfs(start_r, start_c, end_r, end_c);
		
	}
	
	public static void bfs(int start_r, int start_c, int end_r, int end_c) {
		Queue<Position> q = new LinkedList<>();
		boolean[][] b_map = new boolean[N][N];
		q.offer(new Position(start_r, start_c, 0));
		b_map[start_r][start_c] = true;
		while(!q.isEmpty()) {
			
			Position now = q.poll();
			
			if(now.y == end_r && now.x== end_c) {
				System.out.println(now.cnt);
				return;
			}
			for(int i=0; i<6; i++) {
				int nr = now.y + dy[i];
				int nc = now.x + dx[i];
				
				if(nr<0 || nc<0 || nr>=N || nc>=N || b_map[nr][nc]) {
					continue;
				}
				
				
				b_map[nr][nc] = true;
				q.offer(new Position(nr,nc, now.cnt+1));
			}
		}
	
		System.out.println(-1);
	}
	
	
}
