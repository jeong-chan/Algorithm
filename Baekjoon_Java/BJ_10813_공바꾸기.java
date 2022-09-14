import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		int[] balls = new int[size+1];
		for(int i=1; i<=size; i++) {
			balls[i] = i;
		}
		for(int i=0; i<cycle; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			int save = balls[first];
			balls[first] = balls[second];
			balls[second] = save;
		}
		
		for(int i =1; i<=size; i++) {			
			System.out.print(balls[i]+" ");
		}
	}
}
