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
			if(tmp_s.charAt(i)=='<') {
				if(list.isEmpty() != true) {
					for(int j = list.size()-1; j>=0; j--) {
						System.out.print(list.get(j).toString());
						list.remove(j);
					}
				}
				check = true;
				System.out.print(tmp_s.charAt(i));
			}else if(tmp_s.charAt(i)=='>') {
				check = false;
				System.out.print(tmp_s.charAt(i));
			}else {
				if(check == true) {
					System.out.print(tmp_s.charAt(i));
				}else {
					if(tmp_s.charAt(i) == ' ') {
						for(int j = list.size()-1; j>=0; j--) {
							System.out.printf(list.get(j).toString());
							list.remove(j);
						}
						System.out.print(" ");
					}else {
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
