import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens()) {
				String command = st.nextToken();
				if(command.equals("push")) {
					int value = Integer.parseInt(st.nextToken());
					stack.push(value);
				}else if(command.equals("top")) {
					if(!stack.isEmpty()) sb.append(stack.peek());
					else sb.append(-1);
					sb.append("\n");
				}else if(command.equals("size")) {
					sb.append(stack.size());
					sb.append("\n");
				}else if(command.equals("empty")) {
					if(stack.isEmpty()) sb.append(1);
					else sb.append(0);
					sb.append("\n");
				}else if(command.equals("pop")) {
					if(!stack.isEmpty()) sb.append(stack.pop());
					else sb.append(-1);
					sb.append("\n");
				}
			}	
		}
		System.out.println(sb);
	}
}
