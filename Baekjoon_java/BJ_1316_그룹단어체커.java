import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scanner =new Scanner(System.in);
		int testcase = scanner.nextInt();
		int count =0;
		for(int i=0; i<testcase; i++) {
			String input = scanner.next();
			boolean check = false;
			boolean[] alpa = new boolean[26];
			for(int j=0; j<input.length(); j++) {
				if(j==0) {
					alpa[input.charAt(j)-'a'] = true;
					check = true;
				}else {
					if(alpa[input.charAt(j)-'a'] == false) {
						alpa[input.charAt(j)-'a'] = true;
						check = true;
					}else {
						if(input.charAt(j)-'a'==input.charAt(j-1)-'a') {
							check = true;
							continue;
						}else {
							alpa[input.charAt(j)-'a'] = false;
							check = false;
							break;
						}
					}
				}
			}
			if(check == true) count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
