public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int total = 0;
		int tmp_arr[] = new int[T];

		int arr[] = new int[T];
		for(int i=0; i<arr.length; i++) {
			int value = Integer.parseInt(st.nextToken());
			arr[i] = value;
		}

		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			int j =i;
			int sum=0;
			while(j>=0) {
				sum += arr[j--];		
				tmp_arr[i] = sum;
			}
			total += tmp_arr[i];
		}
		System.out.println(total);
	}
}
