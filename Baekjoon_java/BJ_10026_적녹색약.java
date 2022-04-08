public class Main {

	//감지한 RGB 데이터와 그 좌표값을 갖고 있는 객체,
	static class RGB{
		String color;	//색상
		int y;			//y좌표
		int x;			//x좌표
		public RGB(String color, int y, int x) {
			super();
			this.color = color;
			this.y = y;
			this.x = x;
		}

	}
	//static으로 선언된 변수, 배열들
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,-1,0,1};
	static String[][] map;
	static boolean[][] b_map,b_map2;
	static int T,count,count2;
	
	public static void main(String[] args) throws IOException {
		//값을 입력받는 부분, 초기화하는 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		map = new String[T][T];
		b_map = new boolean[T][T];
		b_map2 = new boolean[T][T];
		count = 0;
		count2 = 0;
		
		//맵에 색상 입력
		for(int i=0; i<T; i++) {
			String[] str = new String(br.readLine()).split("");
			map[i] = str;
		}

		//맵을 돌며 bfs탐색
		for(int i=0; i<T; i++) {
			for(int j=0; j<T; j++) {

				if(!b_map[i][j]) {
					bfs(i,j);
				}
				if(!b_map2[i][j]) {
					bfs2(i,j);
				}

			}

		}
		//결과값 출력
		System.out.println(count+" "+count2);
	}



	//비 색약bfs
	public static void bfs(int y, int x) {
		//RGB를 담은 Queue
		Queue<RGB> q = new LinkedList<>();
		//제일 처음 좌표값의 데이터를 RGB객체에 담고 Queue에 offer
		q.offer(new RGB(map[y][x],y,x));
		//해당 좌표 방문 처리
		b_map[y][x] = true;

		while(!q.isEmpty()) {
			//Queue에 담았던 RGB데이터를 가져옴
			RGB rgb = q.poll();
			//4방탐색
			for(int k=0; k<4; k++) {

				int next_y = rgb.y+dy[k];
				int next_x = rgb.x+dx[k];
				//다음 좌표값이 맵을 벗어나거나 || 이미 방문 하였거나 || 다음 좌표값의 rgb값이 나의 rgb가 갖고있는 색상 데이터와 다르면
				if(next_y<0||next_x<0||next_y>=T||next_x>=T||b_map[next_y][next_x]||!map[next_y][next_x].equals(rgb.color)) {
					continue;
				}
				//R로 같은 경우
				if(rgb.color.equals("R")) {
					if(map[next_y][next_x].equals("R")) {
						q.offer(new RGB(map[next_y][next_x],next_y,next_x));
						b_map[next_y][next_x] = true;
					}
				}
				//G로 같은 경우
				if(rgb.color.equals("G")) {

					if(map[next_y][next_x].equals("G")) {
						q.offer(new RGB(map[next_y][next_x],next_y,next_x));
						b_map[next_y][next_x] = true;
					}
				}
				//B로 같은 경우
				if(rgb.color.equals("B")) {
					if(map[next_y][next_x].equals("B")) {
						q.offer(new RGB(map[next_y][next_x],next_y,next_x));
						b_map[next_y][next_x] = true;
					}
				}


			}
			//4방탐색을 전부 마치고 더이상 진출이 불가능 할때 구역 +1
		}count++;
	}
	
	//색약들의 bfs
	public static void bfs2(int y, int x) {
		//RGB를 담은 Queue
		Queue<RGB> q = new LinkedList<>();
		//제일 처음 좌표값의 데이터를 RGB객체에 담고 Queue에 offer
		q.offer(new RGB(map[y][x],y,x));
		//해당 좌표 방문 처리
		b_map2[y][x] = true;

		while(!q.isEmpty()) {
			//Queue에 담았던 RGB데이터를 가져옴
			RGB rgb = q.poll();
			//4방탐색
			for(int k=0; k<4; k++) {

				int next_y = rgb.y+dy[k];
				int next_x = rgb.x+dx[k];
				//다음 좌표값이 맵을 벗어나거나 || 이미 방문 하였으면
				if(next_y<0||next_x<0||next_y>=T||next_x>=T||b_map2[next_y][next_x]) {
					continue;
				}
				//R또는G라서 분간이 어려운 경우
				if(rgb.color.equals("R") || rgb.color.equals("G")) {
					if(map[next_y][next_x].equals("R") || map[next_y][next_x].equals("G")) {
						q.offer(new RGB(map[next_y][next_x],next_y,next_x));
						b_map2[next_y][next_x] = true;
					}
				}
				//B로 같은 경우
				if(rgb.color.equals("B")) {
					if(map[next_y][next_x].equals("B")) {
						q.offer(new RGB(map[next_y][next_x],next_y,next_x));
						b_map2[next_y][next_x] = true;
					}
				}


			}
			//4방탐색을 전부 마치고 더이상 진출이 불가능 할때 구역 +1
		}count2++;
	}







}
