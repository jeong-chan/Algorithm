package com.ssafy.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;	

public class Main {

	static int[] dx= {1,1,0,-1};
	static int[] dy= {0,1,1,1};

	public static int check_win(String[][] map) {

		int tmp_x,tmp_y;

		for(int x=0; x<19; x++) {
			for(int y=0; y<19; y++) {
				
				if(map[x][y].equals("0")) {
					continue;
				}

				for(int index=0; index<dx.length; index++) {

					int count = 1;
					tmp_x = x;
					tmp_y = y;
					int next_x= x+dx[index];
					int next_y= y+dy[index];

					if(next_x<0 || next_x>=19 || next_y<0|| next_y>=19) {
						continue;
					}

					if(map[x][y].equals(map[next_x][next_y])) {

						while(map[x][y].equals(map[next_x][next_y])) {
							count++;
							x=next_x;
							y=next_y;
							next_x= x+dx[index];
							next_y= y+dy[index];
							if(next_x<0 || next_x>=19 || next_y<0|| next_y>=19) {
								break;
							}
						}
						
						if(count>5) {
							x=tmp_x;
							y=tmp_y;
							count = 1;
							continue;
						}else if(count==5) {
							if(tmp_x-dx[index]>=0 && tmp_y-dy[index]>=0) {
								if(map[tmp_x][tmp_y].equals(map[tmp_x-dx[index]][tmp_y-dy[index]])) {
									x=tmp_x;
									y=tmp_y;
									count = 1;
									continue;
								}
							}
							System.out.println(map[x][y]);
							System.out.println((tmp_x+1)+" "+(tmp_y+1));
							return 1;
						}else {
							x=tmp_x;
							y=tmp_y;
							count = 1;
						}
					}else {
						continue;
					}



				}


			}
		}
		System.out.println(0);
		return 0;
	}


	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [][] map = new String[19][19];

		for(int i=0; i<19; i++) {
			map[i] = br.readLine().split(" ");
		}
		check_win(map);


		//출력
		/*for(int i =0; i<19; i++) {
			for(int j =0; j<19; j++) {

				System.out.print(map[0][1]);
			}
			System.out.println();
		}*/


	}
}


















