package ssafy.com.algo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num_switch = sc.nextInt();
		String switches[] = new String[num_switch];
		sc.nextLine();
		switches = sc.nextLine().split(" ");
		/*for(int i =0; i<switches.length;i++) {
		System.out.printf(switches[i]);
		}*/

		int num_student = sc.nextInt();
		int gender[] = new int[num_student];
		int getnumber[] = new int[num_student];

		for(int i =0; i<num_student;i++) {
			gender[i] = sc.nextInt();
			getnumber[i] = sc.nextInt();
		}

		for(int i=0; i<num_student;i++) {
			int tmp_gender = gender[i];
			int tmp_getnumber = getnumber[i];
			if(tmp_gender==1) {

				for(int k = 1; k<=100; k++) {
					if(tmp_getnumber*k-1>=switches.length) {
						break;
					}
					if(switches[tmp_getnumber*k-1].equals("0")) {
						switches[tmp_getnumber*k-1] = "1";
					}else {
						switches[tmp_getnumber*k-1] = "0";
					}
				}
			}else {
				for(int k=0; k<100; k++) {
					if(tmp_getnumber-1-k<0||tmp_getnumber-1+k>=switches.length || !switches[tmp_getnumber-1-k].equals(switches[tmp_getnumber-1+k])) {
						break;
					}

					if(switches[tmp_getnumber-1-k].equals(switches[tmp_getnumber-1+k])) {
						
							if(switches[tmp_getnumber-1-k].equals("1") ) {
								switches[tmp_getnumber-1-k] ="0";
								switches[tmp_getnumber-1+k] ="0";
							}else {
								switches[tmp_getnumber-1-k] ="1";
								switches[tmp_getnumber-1+k] ="1";
							}

							continue;
						
					}else {
						break;
						
					}
				}
				if(switches[tmp_getnumber-1].equals("1")) {
					switches[tmp_getnumber-1]="0";
				}else {
					switches[tmp_getnumber-1]="1";
				}
			}
			for(int o =0; o<switches.length;o++) {
				System.out.printf(switches[o]);
				}
			System.out.println();

		}
		/*for(int i =0; i<switches.length; i++) {
			if(i != 0 && i%20 ==0) {
				System.out.print("\n");
			}
			if(i ==0) {
				System.out.print(switches[0]);
			}else
			System.out.print(" "+switches[i]);
		}*/
	}
}
