import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scanner =new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		
		while(true) {
			String tmp = scanner.next();
			if(tmp.equals("0")) { //0이면 0출력
				break;
			}else {
				boolean check = false;
				char[] tmp_c = tmp.toCharArray();
				char[] tmp_reverse = new char[tmp_c.length];
				int k = 0;
				for(int j =tmp.length()-1; j>=0; j--) { //뒤에서부터 검사
					tmp_reverse[k] =tmp_c[j];
					k++;
				}

				for(int n =0; n<tmp.length(); n++) { //앞에서부터 검사

					if(tmp_reverse[n]==tmp_c[n]) {
						check = true;
					}else {
						check = false;
						break;
					}
				}
				if(check ==true) { //check가 true면 yes 아니면 no
					list.add("yes");
				}else {
					list.add("no");
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		scanner.close();
	}
}
