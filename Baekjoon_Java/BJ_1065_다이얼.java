package ssafy.com.obj.basic;

import java.util.*;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String str_tmp = scanner.nextLine();
		char a = 'A';
		int index = 0;
		int[] time = new int[10]; //각 숫자마다 걸리는 시간을 저장할 배열
		char[][] dial = new char[10][4]; //0~9 각 번호에 해당하는 문자를 저장할 2차원 배열 생성
		for (int i = 0; i < 10; i++) { //반복을 돌며 각 숫자에 해당하는 문자를 전부 저장
			if (i == 7) {
				for (int j = 1; j < 5; j++) {
					dial[i][j - 1] = (char) (a + j - 1);
				}

			} else if (i == 9) {
				for (int j = 1; j < 5; j++) {
					dial[i][j - 1] = (char) ('A' + 21 + j);
				}
			} else if (i == 0 || i == 1) {

			} else if (i < 7) {
				for (int j = 0; j < 3; j++) {
					dial[i][j] = a++;
				}
			} else {
				a = (char) (a + 4);
				for (int j = 0; j < 3; j++) {
					dial[i][j] = a++;
				}
			}

			//각 버튼마다 걸리는 시간 저장
			if(i==1) {
				time[1]=2;
			}else if(i==0){
				time[0]=11;
			}else {
				time[i] = i+1;
			}
		}

		//문자열의 길이만큼 반복
		for (int k = 0; k < str_tmp.length(); k++) {
			//알파벳을 통해 해당 알파벳이 들어있는 숫자 탐색
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 4; j++) {
					if(dial[i][j] == str_tmp.charAt(k)) {
						//숫자를 찾으면 해당하는 숫자가 걸리는 시간 누적 합
						index += time[i];
					}
					//System.out.print(dial[i][j]);
				}
				//	System.out.println(i);
			}
		}
		//누적합 프린트
		System.out.println(index);
		scanner.close();
	}
}
