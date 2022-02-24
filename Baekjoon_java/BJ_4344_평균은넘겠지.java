//BJ_4344_평균은 넘겠지

import java.util.*;

public class Main {
	public static void main(String[] args) {
    //<입력부>
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		double[] avg_scores = new double[C];    //평균점수 저장할 배열
		double[] total_scores = new double[C];  //총합점수 저장할 배열
		double[] persentage = new double[C];    //퍼센테이지(%) 저장할 배열
		for(int k=0; k<C; k++) {
			int upper_student = 0;         
			int students_count = scanner.nextInt();
			double[] students_scores = new double[students_count];
			for(int i=0;i<students_scores.length;i++) {
				students_scores[i] = scanner.nextDouble();
				total_scores[k] += students_scores[i];              //학생들의 점수를 더하기
			}
			avg_scores[k] = 1.0*total_scores[k]/students_count;   //평균점수 구하기

			for(int i=0;i<students_scores.length;i++) {
				if(students_scores[i]>avg_scores[k])
					upper_student++;                          //평균이 넘는 학생수만큼 증가
			}
			persentage[k] = 1.0*upper_student/students_count*100;     //퍼센테이지(%) 구하기
		}
		
		for(int i=0;i<persentage.length;i++) {
			System.out.printf("%.3f"+"%%",persentage[i]);         //소수점 3자리만큼 퍼센트 출력
			System.out.println();
		}
		
		scanner.close();
	}
}


