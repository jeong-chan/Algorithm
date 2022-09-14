/BJ_8958_OX퀴즈
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int numberOfcorrect=0;  //O의 개수
		int score = 0;          //점수를 담을 변수
		String[] chars = new String[k];
		String chars_detail = null;
		for(int i=0;i<chars.length;i++) {   //OX입력받기
			chars[i] = scanner.next();
		}
		for(int i=0; i<k;i++) {
			chars_detail = chars[i];          //OX세분화하여 한줄씩 계산
			for(int j=0;j<chars_detail.length();j++) {
				if(chars_detail.charAt(j) == 'O') { //j번째 character가 O일때
					numberOfcorrect++;                //O의 갯수를 늘리고
					score += numberOfcorrect;         //늘린 갯수만큼 더하기
				}else {
					numberOfcorrect = 0;              //X를 만나면 O의 갯수는 다시 0으로
				}
			}
			System.out.println(score);            //점수출력
			score = 0;
			numberOfcorrect = 0;
			
		}
		
		scanner.close();
	}
}

