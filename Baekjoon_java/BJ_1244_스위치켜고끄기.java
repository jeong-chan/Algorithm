package ssafy.com.algo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	static int[] swithes;    

  //남학생 동작 메서드
	public static void boy_student(int a) {

		for(int i=1; i*a<=swithes.length; i++) {
			if(swithes[i*a-1]==1)
				swithes[i*a-1]=0;
			else
				swithes[i*a-1]=1;
		}
	}

  //여학생 동작 메서드
	public static void girl_student(int a) {
		int right = a-1;
		int left = a-1;

		while(true){
			right++;
			left--;
			if(right>=swithes.length || left<0 || swithes[left]!=swithes[right]) {
				right--;
				left++;
				break;
			}
		}

		for(int i=left; i<=right; i++) {
			if(swithes[i]==1) {
				swithes[i]=0;
			}
			else {
				swithes[i]=1;
			}
		}
	}
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		swithes = new int[N];
		sc.nextLine();
		String[] on_off = sc.nextLine().split(" ");

		for(int i=0; i<N; i++) {
			swithes[i] = Integer.parseInt(on_off[i]);
		}

		int M = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<M; i++) {
			String[]	student = sc.nextLine().split(" ");
			if(Integer.parseInt(student[0])==1) {
				boy_student(Integer.parseInt(student[1]));
			}
			else {
				girl_student(Integer.parseInt(student[1]));
			}
		}
		

    //한줄에 20개씩 
		for(int i=0; i<N; i++) {
			if(i!=0 && i%20==0) {
				System.out.println();
			}
			System.out.print(swithes[i]+" ");
		}
	}


}
