import java.util.*;

public class Test {
    public static void main(String[] args) {
    //<입력부>
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int numOfhansu =0;  //한수의 개수를 저장할 변수
		for(int i=1; i<=N; i++) {
			numOfhansu += hansu(i);
		}
    //<출력부>
		System.out.println(numOfhansu);

		scanner.close();
	}
    
  //메서드
  //한수를 구하는 메서드
	public static int hansu(int n) {
		int count = 0;          
		int[] sum = new int[3];
		if(n>=100) {      //n의 범위값 지정
			if(n==1000) {
				return 0;
			}
			
			for(int i =0;i<sum.length;i++) {  //sum배열에 각 자리수를 저장
				sum[i] = n%10;
				n = n/10;
			}
			int hun = sum[2]; //백의자리
			int ten = sum[1]; //십의자리
			int one = sum[0]; //일의자리
			
			if((hun - ten) == (ten - one)) {  //백의자리수-십의자리수 == 십의자리수-일의자리수
				count++;                        //이면 count 증가
			}
        }else {                         //n이 100보다 작은 경우
			count++;                          //count 증가
		}
        return count;                   //count return;
	}

}
