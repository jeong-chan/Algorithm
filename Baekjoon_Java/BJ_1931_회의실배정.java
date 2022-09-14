import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;	

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testcase_s = br.readLine();
		int testcase = Integer.parseInt(testcase_s);
		String[][] timetable = new String[testcase][2];
		int[][] timetable_int = new int[testcase][2];

		int count = 1;
		
		for(int i =0; i<testcase;i++) {
			timetable[i] = br.readLine().split(" ");
		}

		for(int i =0; i<timetable.length; i++) {
			for(int j =0; j<timetable[i].length; j++) {
				timetable_int[i][j] = Integer.parseInt(timetable[i][j]);
			}
		}
		br.close();

		Arrays.sort(timetable_int, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}

		});
		
		int time = timetable_int[0][1];
		
		for(int i =1; i<testcase; i++) {
			if(timetable_int[i][0] >= time ) {
				time = timetable_int[i][1];
				count++;
			}
		}

			System.out.println(count);
		}
	}
