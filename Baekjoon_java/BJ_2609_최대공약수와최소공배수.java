public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		System.out.println(GCD(A,B));
		System.out.println((A*B)/GCD(A,B));
	}

	public static int GCD(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return GCD(b,a%b);
		}
	}



}
