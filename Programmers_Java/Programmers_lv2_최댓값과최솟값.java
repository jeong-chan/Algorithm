import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Programmers_lv2_최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        int[] nArray = new int[sArray.length];
        for(int i=0; i<sArray.length; i++){
            nArray[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(nArray);
        answer += nArray[0] + " " + nArray[nArray.length-1];

        return answer;
    }
}
