import java.util.*;

public class Main {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();  //처음 들어오는 숫자 저장
		int number2 = scanner.nextInt();  //다음 들어오는 숫자 저장
		StringBuilder sb = new StringBuilder(); //스트링빌더 1생성
		StringBuilder sb2 = new StringBuilder(); //스트링빌더 2생성
		int max = 0; //최대값을 저장할 변수 생성하고 초기화
		char[] tmp = new char[3]; //3자리 숫자를 각 자리 수별로 저장할 배열1 생성
		char[] tmp2 = new char[3]; //3자리 숫자를 각 자리 수별로 저장할 배열2 생성
		int count =0; //각자리수를 나타낼 카운트
		for(int i =tmp.length-1; i>=0; i--) {
			
			tmp[i]=Integer.toString(number1).charAt(count); //배열의 마지막 인덱스부터 입력받은 숫자1을 char형으로 숫자의 앞자리부터 저장
			tmp2[i]=Integer.toString(number2).charAt(count); //배열의 마지막 인덱스부터 입력받은 숫자2를 char형으로 숫자의 앞자리부터 저장
			
			count++;  //카운트를 증가시켜 다음자리로 넘어감
		}
		
		for(int i =0; i<tmp.length;i++) { //배열의 각 자리수를 스트링빌더에 각각 append
			sb.append(tmp[i]);
			sb2.append(tmp2[i]);
		}
		String tmp_tmp = sb.toString(); //스트링빌더를 String 변수에 저장
		String tmp_tmp2 = sb2.toString(); //스트링빌더2를 String 변수에 저장
		max = Integer.parseInt(tmp_tmp);  //tmp1을 max값에 형변환하여 저장
		if(max<Integer.parseInt(tmp_tmp2)) { //tmp2와 max를 비교해서 더 큰 것을 max에 저장
			max = Integer.parseInt(tmp_tmp2);
		}
		System.out.println(max); //max 출력
		scanner.close();
	}
}
