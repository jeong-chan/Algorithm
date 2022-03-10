package com.ssafy.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;	

public class Main {

	public static int check_map(char[][]map) {
		int max_j = 1;
		int max_i = 1;

		for(int i =0; i<map.length; i++) {
			int count =1;
			for(int j =0; j<map[i].length; j++) {

				if(j+1<map[i].length) {
					if(map[i][j] == map[i][j+1]) {
						count++;
					}else {
						count = 1;
					}
					if(count>max_j) {
						max_j = count;
					}
				}
			}
		}
		for(int j =0; j<map.length; j++) {
			int count =1;
			for(int i =0; i<map.length; i++) {
				if(i+1<map.length) {
					if(map[i][j] == map[i+1][j]) {
						count++;
					}else {
						count = 1;
					}
					if(count>max_i) {
						max_i = count;
					}
				}
			}

		}
		return Math.max(max_j, max_i);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testcase_s = br.readLine();
		int testcase = Integer.parseInt(testcase_s);
		char[][] map = new char[testcase][testcase];
		char tmp_c;
		int maximumi = 1;
		int maximumj = 1;
		for(int i=0; i<testcase; i++) {
			map[i] = br.readLine().toCharArray();
		}

		for(int i =0; i<testcase; i++) {
			for(int j =0; j<testcase; j++) {
				int tmp_maximumj =0;
				int tmp_maximumi =0;
				if(j+1<testcase) {

					if(map[i][j]==map[i][j+1]) {
						continue;
					}else {
						tmp_c = map[i][j];
						map[i][j] = map[i][j+1];
						map[i][j+1]=tmp_c;

						tmp_maximumj = check_map(map);
						if(tmp_maximumj>maximumj) {
							maximumj = tmp_maximumj;
						}
						map[i][j+1] = map[i][j];
						map[i][j] = tmp_c;

					}
				}
				if(i+1<testcase) {
					if(map[i][j]==map[i+1][j]) {
						continue;
					}else {
						tmp_c = map[i][j];

						map[i][j] = map[i+1][j];
						map[i+1][j]=tmp_c;
						tmp_maximumi = check_map(map);
						if(tmp_maximumi>=maximumi) {
							maximumi = tmp_maximumi;
						}
						map[i+1][j] = map[i][j];
						map[i][j] = tmp_c;
					}
				}

			}
		}
		System.out.println(Math.max(maximumi, maximumj));
	}
}
