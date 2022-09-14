import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    //<입력부>
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine(); //단어입력
		char[] words = word.toCharArray(); //char배열로 문자열 분리
		int[] index = new int[26]; // 알파벳이 몇번째에 오는지 담을 배열
		for(int i=0; i<index.length; i++) { //index배열을 -1로 초기화
			index[i] = -1; 
		}
		for(int i=0; i<words.length; i++) { //단어의 길이만큼 반복
			index[words[i]-'a']=word.indexOf(words[i]);			//index배열의 [알파벳-'a']의 자리는 알파벳의 자리수를 담음
   	}                                                 //예를 들면, word의 첫자리가 a일경우 index[0]에 word에서 a가 몇번째로 왔는지 담을 수 있음
    //<출력부>
		for(int i=0; i<index.length; i++) { //순서대로 index배열 출력
			System.out.print(index[i]+" "); 
		}
	}
}
