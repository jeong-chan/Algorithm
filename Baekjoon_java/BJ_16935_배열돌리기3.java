public class Main {

	//	static int[][] tmp_map;
	static int N,M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		//	tmp_map = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int value = Integer.parseInt(st.nextToken());
				arr[i][j] = value;
				//			tmp_map[i][j] = value;
			}
		}

		String num[] =br.readLine().split(" ");

		for(int t=0; t<num.length;t++) {
			switch(num[t]) {

			case "1": 


				arr =case1(arr);


				break;
			case "2":


				arr =case2(arr);

				break;
			case "3":


				arr =case3(arr);

				break;
			case "4":


				arr =case4(arr);


				break;
			case "5":


				arr = case5(arr);
				break;
			case "6":


				arr =case6(arr);


				break;
			}

		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);


	}

	public static int[][] case1(int[][] arr) {
		int[] tmp = new int[arr[0].length];

		for(int i=0; i<arr.length/2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}

		return arr;
	}

	public static int[][] case2(int[][] arr) {
		int[] tmp = new int[arr.length];

		for(int j =0; j<arr[0].length/2; j++) {
			for(int i=0; i<arr.length; i++) {
				tmp[i] = arr[i][j];
				arr[i][j] = arr[i][arr[0].length-1-j];
				arr[i][arr[0].length-1-j] = tmp[i];
			}
		}

		return arr;

	}

	public static int[][] case3(int[][] arr) {
		int[][] tmp_arr = new int[M][N];


		for(int i=0; i<M; i++) {
			int[] tmp = new int[N];
			for(int j=0; j<N; j++) {
				tmp[j] = arr[N-1-j][i];
			}
			tmp_arr[i] = tmp;
		}
		int temp = M;
		M = N;
		N = temp;

		arr= tmp_arr;

		return arr;

	}

	public static int[][] case4(int[][] arr) {
		int[][] tmp_arr = new int[M][N];

		for(int j =0; j<M; j++) {
			int[] tmp = new int[N];
			for(int i=0; i<N; i++) {
				tmp[i] = arr[i][M-1-j];
			}
			tmp_arr[j] = tmp;
		}

		int temp = M;
		M = N;
		N = temp;

		arr=tmp_arr;

		return arr;
	}

	public static int[][] case5(int[][] arr) {

		int[][] tmp_arr =new int[N][M];

		int[] dx= {(M/2),0,-(M/2),0};
		int[] dy= {0,(N/2),0,-(N/2)};

		for(int i=0; i<N/2; i++) {
			for(int j=0; j<M/2; j++) {
				tmp_arr[i+dy[0]][j+dx[0]] = arr[i][j]; 
			}
		}
		for(int i=0; i<N/2; i++) {
			for(int j=M/2; j<M; j++) {
				tmp_arr[i+dy[1]][j+dx[1]] = arr[i][j];
			}
		}
		for(int i=N/2; i<N; i++) {
			for(int j=M/2; j<M; j++) {
				tmp_arr[i+dy[2]][j+dx[2]] = arr[i][j];
			}
		}
		for(int i=N/2; i<N; i++) {
			for(int j=0; j<M/2; j++) {
				tmp_arr[i+dy[3]][j+dx[3]] = arr[i][j];
			}
		}

		arr=tmp_arr;

		return arr;


	}
	public static int[][] case6(int[][] arr) {
		int[][] tmp_arr =new int[N][M];

		int[] dx= {0,-(M/2),0,(M/2)};
		int[] dy= {(N/2),0,-(N/2),0};

		for(int i=0; i<N/2; i++) {
			for(int j=0; j<M/2; j++) {
				tmp_arr[i+dy[0]][j+dx[0]] = arr[i][j]; 
			}
		}
		for(int i=0; i<N/2; i++) {
			for(int j=M/2; j<M; j++) {
				tmp_arr[i+dy[1]][j+dx[1]] = arr[i][j];
			}
		}
		for(int i=N/2; i<N; i++) {
			for(int j=M/2; j<M; j++) {
				tmp_arr[i+dy[2]][j+dx[2]] = arr[i][j];
			}
		}
		for(int i=N/2; i<N; i++) {
			for(int j=0; j<M/2; j++) {
				tmp_arr[i+dy[3]][j+dx[3]] = arr[i][j];
			}
		}

		arr=tmp_arr;

		return arr;
	}
}
