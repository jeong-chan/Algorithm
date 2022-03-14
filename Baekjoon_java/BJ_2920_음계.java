import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int start = Integer.parseInt(st.nextToken());
		if(start ==1) {
			while(st.hasMoreTokens()) {
				if(Integer.parseInt(st.nextToken())==start+1) {
					start += 1;	
				}else {
					sb.append("mixed");
					System.out.println(sb);
					return;
				}
			}
			sb.append("ascending");{
				System.out.println(sb);
				return;

			}
		}else if(start == 8) {
			while(st.hasMoreTokens()) {
				if(Integer.parseInt(st.nextToken())==start-1) {
					start -=1;
				}else {
					sb.append("mixed");
					System.out.println(sb);
					return;
				}
			}
			sb.append("descending");
			System.out.println(sb);
			return;
		}else {
			sb.append("mixed");
			System.out.println(sb);
			return;
		}
	}
}
