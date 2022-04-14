public class Main {
	static char [] selected,allchar;
	static int select, numbers;
	static ArrayList<Character> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		select = Integer.parseInt(st.nextToken());
		numbers = Integer.parseInt(st.nextToken());
		selected = new char[select];
		allchar = new char[numbers];
		String[] str = br.readLine().split(" ");
		for(int i=0; i<str.length; i++) {
			allchar[i] = str[i].charAt(0);		
		}
		Arrays.sort(allchar);
		permu(0,0);
		System.out.println(sb);
	}
	
	public static void permu(int cnt, int start) {
		if(cnt == select) {
			if(check(selected)) {
				for(int i=0; i<selected.length; i++) {
					sb.append(selected[i]);
				}
				sb.append("\n");
			}
			return;
		}
		
		for(int i=start; i<numbers; i++) {
			selected[cnt] = allchar[i];
			permu(cnt+1, i+1);
		}
	}
	
	public static boolean check(char[] arr) {
		int count_a =0;
		int count_b =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'a' || arr[i] =='e' || arr[i] =='i' || arr[i] =='o' || arr[i] =='u') {
				count_a++;
			}else {
				count_b++;
			}
		}
		if(count_a >=1 && count_b >=2) return true;
		else return false;
	}
}
