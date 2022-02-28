import java.util.*;

public class Test {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int test_case = scanner.nextInt();      //테스트케이스만큼 반복
		String[] result = new String[test_case];//문자열을 저장할 배열

		for(int i = 0; i<test_case; i++) {
			int count=0;                          
			StringBuilder sb = new StringBuilder();
			int numberofloop = scanner.nextInt(); //문자당반복횟수를 저장할 변수
			String str = scanner.next();  //문자입력
			char[] str_result = new char [str.length()*numberofloop]; //반복을 완료한 문자열을 담을 배열
			
			for(int j =0; j<str.length(); j++) {   //문자의 길이만큼 반복
					for(int k=0;k<numberofloop;k++) {  //지정된 반복횟수만큼 반복
						str_result[count] = str.charAt(j); //반복횟수만큼 문자열을 반복시킴
						count++;  //인덱스 이동
					}
			}
			sb.append(str_result);  //스트링빌더에 저장
			result[i] = sb.toString(); //배열에 스트링빌더를 다시저장
		}
			for(int i = 0; i<test_case;i++) {
				System.out.println(result[i]);  //배열출력
			}
		scanner.close();
		
	}
}
