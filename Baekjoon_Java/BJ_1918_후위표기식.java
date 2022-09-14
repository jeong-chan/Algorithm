public class Main {

	public static void main(String[] args) throws IOException,EmptyStackException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str  = br.readLine().toCharArray();
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length; i++) {
			String tmp = String.valueOf(str[i]);
			//숫자가 오는 경우
			if(!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*") && !tmp.equals("/") && !tmp.equals("(") && !tmp.equals(")")) {
				sb.append(tmp);
				continue;
			//연산자가 오는 경우
			}else {
				//스택이 비어있으면
				if(stack.isEmpty()) {
					stack.push(tmp);
					continue;
				//스택이 비어있지 않으면
				}else {
					//+,-가 오는 경우
					if(tmp.equals("+") || tmp.equals("-")) {
						//스택 연산자보다 순위가 모두 높거나 같기 떄문에 전부 빼고 자신 들어가기
						while(!stack.isEmpty()) {
							if(stack.peek().equals("(")) {
								break;
							}
							sb.append(stack.pop());
						}
						stack.push(tmp);
						continue;
					//*,/가 오는 경우
					}else if(tmp.equals("*") || tmp.equals("/")) {
						while(!stack.isEmpty()) {
							//순위가 같은 경우
							if(stack.peek().equals("*") || stack.peek().equals("/")) {
								sb.append(stack.pop());
							//순위가 다른경우
							}else {
								break;
							}
						}
						stack.push(tmp);
						continue;
					//괄호가 열리는 경우
					}else if(tmp.equals("(")) {
						stack.push(tmp);
						continue;
					}else {
						while(!stack.peek().equals("(")){
							sb.append(stack.pop());
						}
						stack.pop();
						continue;
					}
				}
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());



	}
}
