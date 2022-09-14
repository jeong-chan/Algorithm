import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int test_case = scanner.nextInt();
		int[] line = new int[test_case];
		int penguin_index=0;
		int min1;
		int min2;
		for(int i =0; i<line.length; i++) {
			line[i] = scanner.nextInt();
			if(line[i]==-1) {
				penguin_index = i;      //펭귄의 위치 찾기
			}
            
		}
            min1 = line[0];       //왼쪽 최소값 찾기
		    min2 = line[test_case-1]; //오른쪽 최소값 찾기
		for(int j=0; j<line.length; j++) {

			
			if(j<penguin_index) { //라인의 길이에서 펭귄의 위치보다 왼쪽에 있는 값중 최소값
				if(line[j]<=min1) {
					min1 = line[j];	
				}else {
					continue;
				}
			}else if(j>penguin_index) { //라인의 길이에서 펭귄의 취이보다 오른쪽에 잇는 값중 최소값
				if(line[j]<=min2) {
					min2 = line[j];
				}else {
					continue;
				}
			}else{
				continue;
			}
			
		}
		int sum = min1+min2; //두 최소값의 합
		System.out.println(sum); //출력
		scanner.close();
	}


}

