public class Main {

	static int[] ans;
	static ArrayList<Integer> out_stack = new ArrayList<Integer>(); 
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> top = new Stack<Integer>();
		int T = sc.nextInt();

		ans = new int[T];

		for(int i =0; i<T; i++) {
			top.push(sc.nextInt());
		}
		for(int i =T; i>0; i--) {

			ans[i-1] = laser(top);

		}

		for(int i =0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
		sc.close();
	}



	public static int laser(Stack<Integer> top) {

		int first;
		int index;
		
		if(top.size()<=1) return 0;

		first = top.peek();
		top.pop();

		if(first <= top.peek()) {
			index = top.size();
			
		}else {
			while(first >= top.peek()) {
				
				out_stack.add(top.pop());
				if(top.isEmpty()) {
					break;
					
				}
				
			}
			index = top.size();
			for(int j =out_stack.size(); j>0; j--) {
				top.push(out_stack.get(j-1));
			}
			out_stack.clear();


		}

		return index;

	}

}
