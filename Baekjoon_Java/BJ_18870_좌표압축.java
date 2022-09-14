import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Integer> list = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		Map<Integer, Integer> rank = new HashMap<>();

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i<T; i++) {
			int input = Integer.parseInt(st.nextToken());
			list.add(input);
			list2.add(input);
		}


		Set<Integer> set = new HashSet<Integer>(list);
		ArrayList <Integer> list3 = new ArrayList<>(set);
		Collections.sort(list3);

		for(int i =0; i<list3.size(); i++) {
			rank.put(list3.get(i), i);
		}
		StringBuilder sb = new StringBuilder();

		for(int k=0; k<list2.size(); k++) {

			sb.append(rank.get(list2.get(k))).append(" ");

		}

		System.out.println(sb);
	}

}








