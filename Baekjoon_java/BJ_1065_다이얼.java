import java.util.*;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String str_tmp = scanner.nextLine();
		char a = 'A';
		int index = 0;
		int[] time = new int[10];
		char[][] dial = new char[10][4];
		for (int i = 0; i < 10; i++) {
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
			if(i==1) {
				time[1]=2;
			}else if(i==0){
				time[0]=11;
			}else {
				time[i] = i+1;
			}
		}

		for (int k = 0; k < str_tmp.length(); k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 4; j++) {
					if(dial[i][j] == str_tmp.charAt(k)) {
						index += time[i];
					}
					//System.out.print(dial[i][j]);
				}
				//	System.out.println(i);
			}
		}
		System.out.println(index);
		scanner.close();
	}
}
