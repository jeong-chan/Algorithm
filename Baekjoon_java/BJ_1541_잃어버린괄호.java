public class Main {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = str;
		str = str.replace("+", " ");
		str = str.replace("-", " ");
		StringTokenizer st = new StringTokenizer(str," ");
		int size = st.countTokens();
		Stack <Integer> number = new Stack<>();
		for(int i=0; i<size; i++) {
			number.push(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(str2,"1234567890");
		int size_2 = st.countTokens();
		Stack <String> signal = new Stack<>();
		for(int i=0; i<size_2; i++) {
			signal.push(st.nextToken());
		}

		int sum=0;


		for(int i=0; i<size_2; i++) {
			String pop = signal.pop();
			if(pop.equals("-")) {
				sum -= number.pop();

			}else if(pop.equals("+")){
				int a = number.pop()+number.pop();
				number.push(a);
			}

		}

		if(number.size()==1) {
			sum+=number.pop();
		}
		
		System.out.println(sum);


	}

}
