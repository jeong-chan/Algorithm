//백준1546 평균
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] scores = new int[N];
		int max = 0;
		double[] new_scores = new double[N];
		double sumOfnewscores = 0;
		double result = 0;
		for(int i=0; i<scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		for(int i =0; i<scores.length;i++) {
			if(max <= scores[i]) {
				max = scores[i];
			}
		}
		
		for(int i=0; i<scores.length;i++) {
			if(scores[i] != max) {
				new_scores[i] = 1.0*scores[i]/max*100;
			}else {
				new_scores[i] = 100*1.0;
			}
		}
		for(int i=0; i<new_scores.length; i++) {
			sumOfnewscores += new_scores[i];
		}
		result = sumOfnewscores/N;
		System.out.println(result);
		scanner.close();
	}
}
