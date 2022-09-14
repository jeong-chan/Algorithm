package com.ssafy.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;


public class Main {

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> list = new ArrayList<Character>();
		String tmp_s = null;
		try {
			tmp_s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = false;
		for(int i =0; i<tmp_s.length(); i++) {
			if(tmp_s.charAt(i)=='<') { //<가 열리면 check를 true처리
				if(list.isEmpty() != true) {
					for(int j = list.size()-1; j>=0; j--) {
						System.out.print(list.get(j).toString());
						list.remove(j);
					}
				}
				check = true;
				System.out.print(tmp_s.charAt(i));
			}else if(tmp_s.charAt(i)=='>') { //>가 닫히면 check를 false처리
				check = false;
				System.out.print(tmp_s.charAt(i));
			}else {
				if(check == true) { //check가 true이면 있는 그대로 출력
					System.out.print(tmp_s.charAt(i));
				}else {
					if(tmp_s.charAt(i) == ' ') { //공백을 만나면 시작하는 공백을 만나기 전의 문자들을 거꾸로 출력
						for(int j = list.size()-1; j>=0; j--) {
							System.out.printf(list.get(j).toString());
							list.remove(j);
						}
						System.out.print(" ");
					}else { // 나머지 문자 처리
						list.add(tmp_s.charAt(i));
						if(i==tmp_s.length()-1) {
							for(int j = list.size()-1; j>=0; j--) {
								System.out.printf(list.get(j).toString());
								list.remove(j);
							}
						}
					}
				}

			}

		}

	}
}
