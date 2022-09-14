import java.util.*;

public class Test {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next().toUpperCase(); //문자를 전부 대문자로 받아온다
		int [] alpa = new int[26]; //알파벳을 체크할 크기 26의 배열을 생성한다
		int max=0; //가장 많이 사용된 알파벳의 횟수를 체크할 변수 생성
		int index;
		char result = 'a';
		for(int i=0;i<word.length();i++) {
			index = word.charAt(i)-65; //입력받은 문자의 첫번째 자리부터 대문자 A값을 배주고 인덱스 값으로 활용한다
			
			alpa[index]++; //해당 문자가 나온 인덱스의 값을 +1
			if(max<alpa[index]) { //최대값을 갱신
				max = alpa[index];
				result = word.charAt(i); //결과값 갱신
			}else if(max == alpa[index]) { // 최대값이 같은게 있으면 '?'출력
				result = '?';
			}
		}
		System.out.println(result);
		scanner.close();
		
	}
}
