public class Solution {
	static ArrayList<String> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static String[] words;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<6; i++) {
			list.add(br.readLine());
		}
		
		words = new String[3];
		permu(0,0);
		if(sb.length()==0) {
		 System.out.println(0);	
		}else {
		System.out.println(sb);
		}
	}
	
	public static void permu(int flag, int cnt) {
		if(cnt == 3) {
			//System.out.println("YET: "+Arrays.toString(words));
			if(check(words) && sb.length()==0) {
			//	System.out.println("SUCESS: "+Arrays.toString(words));
				sb.append(words[0]).append("\n");
				sb.append(words[1]).append("\n");
				sb.append(words[2]);
				
			}
			//System.out.println("FAIL: "+Arrays.toString(words));
			return;
		}
		
		for(int i=0; i<list.size(); i++) {
			if((flag & (1<<i)) != 0) {
				continue;
			}
			words[cnt] = list.get(i);
			permu((flag | (1<<i)),cnt+1);
		}
	}

		
	public static boolean check(String[] arr) {
		ArrayList <String> tmp = new ArrayList<>();
		tmp = (ArrayList<String>) list.clone();
		String a1 = String.valueOf(arr[0].charAt(0))+String.valueOf(arr[1].charAt(0))+String.valueOf(arr[2].charAt(0));
		String a2 = String.valueOf(arr[0].charAt(1))+String.valueOf(arr[1].charAt(1))+String.valueOf(arr[2].charAt(1));
		String a3 = String.valueOf(arr[0].charAt(2))+String.valueOf(arr[1].charAt(2))+String.valueOf(arr[2].charAt(2));
		if(tmp.contains(arr[0]) &&tmp.contains(a1) && tmp.contains(arr[1]) && tmp.contains(a2) && tmp.contains(arr[2]) && tmp.contains(a3)) {
			if(tmp.contains(arr[0])) tmp.remove(arr[0]);
		//	System.out.println(list.toString());
			if(tmp.contains(arr[1])) tmp.remove(arr[1]);
		//	System.out.println(list.toString());
			if(tmp.contains(arr[2])) tmp.remove(arr[2]);
		//	System.out.println(list.toString());
			if(tmp.contains(a1)) tmp.remove(a1);
		//	System.out.println(list.toString());
			if(tmp.contains(a2)) tmp.remove(a2);
		//	System.out.println(list.toString());
			if(tmp.contains(a3)) tmp.remove(a3);
		//	System.out.println(list.toString());
			if(tmp.size() != 0) {
				return false;
			}
			
			
			return true;
		}
		return false;
	}
}
