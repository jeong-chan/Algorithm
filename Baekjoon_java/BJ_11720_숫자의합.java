import java.util.*;

public class Test {
	
	
	public static void main(String[] args) throws Exception{
		//<입력부>
		Scanner scanner = new Scanner(System.in);
		int test_case = scanner.nextInt();
    String st_number = scanner.next(); //문자열로 받아오기
		int[] number = new int[test_case]; //문자의 길이만큼 배열 생성
		int sum =0; //숫자의 총합을 저장할 배열
		for(int i = 0; i<number.length; i++) {
			number[i] = st_number.charAt(i)-48; //char값에서 '0'을 의미하는 48을 빼고
			sum +=number[i];  //숫자의 총합 누적
		}
    //<출력부>
		System.out.println(sum);
		scanner.close();
		
	}
}
