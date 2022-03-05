import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scanner =new Scanner(System.in);
		String input = scanner.next();
		String[] excp = {"dz=","d-","c=","c-","lj","nj","s=","z="}; //크로아티아 알파벳을 담는 배열 생성
		String input2 = input;
		for(int i =0;i<excp.length;i++) { //크로아티아 알파벳에 해당하는 자리를 공백으로 대체
			String tmp = input2;
			tmp = input2.replaceAll(excp[i], " ");
			input2 = tmp;
		}
		System.out.println(input2.length()); //대체완료된 문자열의길이 = 공백의 갯수 = 크로아티아 알파벳의 갯수
		scanner.close();
	}
}








